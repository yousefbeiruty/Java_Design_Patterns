package com.example.corepatterns.patterns.creational.prototype;

public class Test {

    public static void main(String[] args) throws CloneNotSupportedException {
        Game game=new Game();
        game.setId(1);
        game.setName("Pubg");
        game.setMemberShip(new MemberShip());

        Game game2=game.clone();
        System.out.println(game);
        System.out.println(game2);

        Game game3=new Game(game);
        System.out.println(game3);
    }
}
