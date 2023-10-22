package org.example;

public class Main
{
    public static void main(String[] args)
    {
        CreateAvto createAvto = new CreateAvto();
        StartProgram startProgram = new StartProgram();
        startProgram.strartProgram(createAvto.createAvto());
    }
}
