package pl.ReportCreator.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "sightings")
public class Sighting {

    @Id
    @Column(
            name = "id",
            updatable = false
    )
    private Long id;

    @Column(
            name = "title"
    )
    private String title;

    @Column(
            name = "cycle_found"
    )
    private String foundInCycle;

    @Column(
            name = "priority"
    )
    private String priority;

    @Column(
            name = "new_issue_status"
    )
    private Boolean newIssueStatus;

    @Column(
            name = "regression_status"
    )
    private String regressionStatus;

    @Column(
            name = "status_reason"
    )
    private String statusReason;
    @Column(
            name = "component"
    )
    private String component;

    public Sighting() {
    }

    public Sighting(Long id, String title, String foundInCycle, String priority, Boolean newIssueStatus, String regressionStatus, String statusReason, String component) {
        this.id = id;
        this.title = title;
        this.foundInCycle = foundInCycle;
        this.priority = priority;
        this.newIssueStatus = newIssueStatus;
        this.regressionStatus = regressionStatus;
        this.statusReason = statusReason;
        this.component = component;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFoundInCycle() {
        return foundInCycle;
    }

    public void setFoundInCycle(String foundInCycle) {
        this.foundInCycle = foundInCycle;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public Boolean getNewIssueStatus() {
        return newIssueStatus;
    }

    public void setNewIssueStatus(Boolean newIssueStatus) {
        this.newIssueStatus = newIssueStatus;
    }

    public String getRegressionStatus() {
        return regressionStatus;
    }

    public void setRegressionStatus(String regressionStatus) {
        this.regressionStatus = regressionStatus;
    }

    public String getStatusReason() {
        return statusReason;
    }

    public void setStatusReason(String statusReason) {
        this.statusReason = statusReason;
    }

    public String getComponent() {
        return component;
    }

    public void setComponent(String component) {
        this.component = component;
    }

    @Override
    public String toString() {
        return "Sighting{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", foundInCycle='" + foundInCycle + '\'' +
                ", priority='" + priority + '\'' +
                ", newIssueStatus=" + newIssueStatus +
                ", regressionStatus='" + regressionStatus + '\'' +
                ", statusReason='" + statusReason + '\'' +
                ", component='" + component + '\'' +
                '}';
    }
}
