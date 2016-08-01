package SteamServerQueryAPI;
import java.net.UnknownHostException;

import SteamServerQuery.SteamServerInfo;
import SteamServerQuery.SteamServerPlayer;
import SteamServerQuery.SteamServerQuery;


public class SourceEngineServerInfo {
	public static void main(String[] args) {		
		try {
			SteamServerQuery ServerQuery = new SteamServerQuery("0.0.0.0:27000");
			/*SteamServerQuery ServerQuery = new SteamServerQuery("0.0.0.0", 27000);*/
			SteamServerInfo ServerInfo = ServerQuery.getInfo();
			SteamServerPlayer ServerPlayer = ServerQuery.getPlayer();
			
			if(ServerInfo != null) {
				System.out.println(ServerInfo.toString());
			}
			
			if(ServerPlayer != null) {
				System.out.println(ServerPlayer.toString());
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
	}
}
