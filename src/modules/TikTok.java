package modules;

public class TikTok {
    final int _id;
    final String name;
    final int follower;
    final int earning;

    public TikTok(int id, String name, int follower, int earning) {
        _id = id;
        this.name = name;
        this.follower = follower;
        this.earning = earning;
    }

    public int get_id() {
        return _id;
    }

    public String getName() {
        return name;
    }

    public int getFollower() {
        return follower;
    }

    public int getEarning() {
        return earning;
    }

    public String toString() {
        return "[Tiktok: { id:" + this._id + ", name:" + this.name + ", follower:" + this.follower + ",  }]";
    }
}
