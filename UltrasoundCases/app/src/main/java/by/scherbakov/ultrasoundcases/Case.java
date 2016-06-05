package by.scherbakov.ultrasoundcases;

import java.util.UUID;

/**
 * Created by User on 16.05.2016.
 */
public class Case {

    private UUID mId;
    private String mTitle;
    private String mDescription;

    public Case() {
        mId = UUID.randomUUID();
    }

    public UUID getId() {
        return mId;
    }

    public void setId(UUID mId) {
        this.mId = mId;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String mTitle) {
        this.mTitle = mTitle;
    }

    public String getDescription() {
        return mDescription;
    }

    public void setDescription(String mDescription) {
        this.mDescription = mDescription;
    }
}
