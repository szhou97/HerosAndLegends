public abstract class ReachableTile extends Tile implements Accessible {
    private Player player;
    public ReachableTile() {
        this.playerExists = false;
        this.player = null;
    }

    @Override
    public void arrive(Player player) {
        this.player = player;
        this.playerExists = true;
        // TODO Auto-generated method stub

    }
    
    @Override
    public void leave() {
        this.player = null;
        this.playerExists = false;
        // TODO Auto-generated method stub

    }
}
