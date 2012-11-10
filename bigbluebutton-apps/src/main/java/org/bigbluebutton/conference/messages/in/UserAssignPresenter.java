package org.bigbluebutton.conference.messages.in;

public class UserAssignPresenter extends AbstractMessageIn {

	public final String newPresenterUserID;
	public final String assignedByUserID;
	
	public UserAssignPresenter(String meetingID, String newPresenterUserID, String assignedByUserID) {
		super(meetingID);
		this.newPresenterUserID = newPresenterUserID;
		this.assignedByUserID = assignedByUserID;
	}
}
