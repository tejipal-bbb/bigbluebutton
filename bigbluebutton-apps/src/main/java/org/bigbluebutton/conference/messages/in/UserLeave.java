package org.bigbluebutton.conference.messages.in;

public class UserLeave extends AbstractMessageIn {

	public final String userID;
	
	public UserLeave(String meetingID, String userID) {
		super(meetingID);
		this.userID = userID;
	}
}
