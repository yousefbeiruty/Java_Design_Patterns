package com.example.corepatterns.patterns.creational.prototype;

public class Game implements Cloneable{

    private int id;
    private String name;

    private MemberShip memberShip;

    Game(){}

    //TODO:-we could use this way of cloning without the need
    // of Cloneable interface
    Game(Game game){
        this.id=game.id;
        this.name=game.name;
        this.memberShip=new MemberShip();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MemberShip getMemberShip() {
        return memberShip;
    }

    public void setMemberShip(MemberShip memberShip) {
        this.memberShip = memberShip;
    }

    @Override
    protected Game clone() throws CloneNotSupportedException {
        Game game= (Game) super.clone();
        game.setMemberShip(new MemberShip());
        return game;
    }

    @Override
    public String toString() {
        return "Game{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", memberShip=" + memberShip +
                '}';
    }
}
