package co.mobilemakers.todo;

/**
 * Created by agustin on 14/02/15.
 */
public class Task {
    private String mTitle;
    private Boolean mDone;

    public Task() {
    }

    public Task(String title, Boolean done) {
        this.mTitle = title;
        this.mDone = done;
    }

    public String getmTitle() {
        return mTitle;
    }

    public void setmTitle(String mTitle) {
        this.mTitle = mTitle;
    }

    public Boolean getmDone() {
        return mDone;
    }

    public void setmDone(Boolean mDone) {
        this.mDone = mDone;
    }
}
