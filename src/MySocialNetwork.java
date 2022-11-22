import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import lt.infobalt.itakademija.javalang.exam.socialnetwork.Friend;
import lt.infobalt.itakademija.javalang.exam.socialnetwork.FriendNotFoundException;
import lt.infobalt.itakademija.javalang.exam.socialnetwork.SocialNetwork;

public class MySocialNetwork implements SocialNetwork {

	private ArrayList<Friend> friends = new ArrayList<>();

	public MySocialNetwork() {
	}

	@Override
	public void addFriend(Friend friend) {

		if (friend == null) {

			throw new IllegalArgumentException();
		}

		if (!friends.contains(friend)) {
			friends.add(friend);

		}
	}

	@Override
	public Collection<Friend> findByCity(String city) {

		ArrayList<Friend> listFromCity = new ArrayList<>();

		for (Friend friend : friends) {
			if (friend.getCity().equals(city)) {
				listFromCity.add(friend);
			}
		}

		return listFromCity;

	}

	@Override
	public Friend findFriend(String firstName, String lastName) throws FriendNotFoundException {

		for (Friend friend : friends) {

			if (friend.getFirstName().endsWith(firstName) && friend.getLastName().equals(lastName)) {

				return friend;

			}
		}

		throw new FriendNotFoundException(firstName, lastName);

	}

	@Override
	public int getNumberOfFriends() {

		return friends.size();

	}

	@Override
	public Collection<Friend> getOrderedFriends() {
		List<Friend> orderedFriends = new ArrayList<>(friends);
		
//		Collections.sort(orderedFriends, new CompareFriends()); kurti savo komparatoriaus klase
		return orderedFriends;
	}

}
