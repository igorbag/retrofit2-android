
package retrofit.igorbagliotti.com.br.soccerapp.standings;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Meta {

    @SerializedName("subscription")
    @Expose
    private Subscription subscription;
    @SerializedName("plan")
    @Expose
    private Plan plan;
    @SerializedName("sports")
    @Expose
    private List<Sport> sports = null;

    public Subscription getSubscription() {
        return subscription;
    }

    public void setSubscription(Subscription subscription) {
        this.subscription = subscription;
    }

    public Plan getPlan() {
        return plan;
    }

    public void setPlan(Plan plan) {
        this.plan = plan;
    }

    public List<Sport> getSports() {
        return sports;
    }

    public void setSports(List<Sport> sports) {
        this.sports = sports;
    }

}
