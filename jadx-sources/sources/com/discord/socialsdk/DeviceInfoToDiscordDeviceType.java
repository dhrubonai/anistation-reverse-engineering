package com.discord.socialsdk;

import java.util.HashMap;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public class DeviceInfoToDiscordDeviceType {
    public static final HashMap<Integer, DiscordDeviceType> mapping = new HashMap<Integer, DiscordDeviceType>() { // from class: com.discord.socialsdk.DeviceInfoToDiscordDeviceType.1
        {
            put(2, DiscordDeviceType.BUILTIN_SPEAKER);
            DiscordDeviceType discordDeviceType = DiscordDeviceType.BLUETOOTH_HEADSET;
            put(27, discordDeviceType);
            put(26, discordDeviceType);
            put(7, discordDeviceType);
            put(23, discordDeviceType);
            DiscordDeviceType discordDeviceType2 = DiscordDeviceType.WIRED_HEADSET;
            put(22, discordDeviceType2);
            put(11, discordDeviceType2);
            put(3, discordDeviceType2);
            put(4, discordDeviceType2);
        }
    };
}
