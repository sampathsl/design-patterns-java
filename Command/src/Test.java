class Test {
    public static void main(String[] args) {
        Receive r = new Receive();
        Command c1 = new TurnOnCommand(r);
        Command c2 = new TurnOffCommand(r);
        Invoker i = new Invoker();

        i.setCommandAndExecute(c1);
        i.setCommandAndExecute(c2);
        i.setCommandAndExecute(c1);

        System.out.println(i.toString());
    }
}
