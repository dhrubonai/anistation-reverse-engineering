package com.discord.socialsdk;

import android.content.Context;
import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.util.Log;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public class DiscordAudioManager extends DiscordAudioManagerInterface {
    private static DiscordAudioManager instance;

    private DiscordAudioManager(Context context) {
        super(context);
    }

    public static DiscordAudioManager getInstance(Context context) {
        DiscordAudioManager discordAudioManager = instance;
        if (discordAudioManager == null) {
            Log.d("DiscordSocialSdk", "Creating new DiscordAudioManager instance");
            DiscordAudioManager discordAudioManager2 = new DiscordAudioManager(context);
            instance = discordAudioManager2;
            return discordAudioManager2;
        }
        return discordAudioManager;
    }

    @Override // com.discord.socialsdk.DiscordAudioManagerInterface
    public AudioDeviceInfo[] androidGetAudioDevices() {
        List availableCommunicationDevices;
        availableCommunicationDevices = this.audioManager.getAvailableCommunicationDevices();
        return (AudioDeviceInfo[]) availableCommunicationDevices.toArray(new AudioDeviceInfo[0]);
    }

    @Override // com.discord.socialsdk.DiscordAudioManagerInterface
    public void setActiveCall(boolean z) {
        this.isActiveCall = z;
        AudioManager audioManager = this.audioManager;
        AudioDeviceCallback audioDeviceCallback = this.audioDeviceCallback;
        if (z) {
            audioManager.registerAudioDeviceCallback(audioDeviceCallback, null);
            updateAudioDevices();
            updateAudioModeForCurrentState();
            updateActiveAudioDevice();
            return;
        }
        audioManager.unregisterAudioDeviceCallback(audioDeviceCallback);
        this.audioManager.clearCommunicationDevice();
        updateAudioModeForCurrentState();
    }

    @Override // com.discord.socialsdk.DiscordAudioManagerInterface
    public boolean setActiveDevice(AudioDeviceInfo audioDeviceInfo) {
        boolean communicationDevice;
        if (audioDeviceInfo == null) {
            return false;
        }
        Log.d("DiscordSocialSdk", "setActiveDevice to type: " + audioDeviceInfo.getType());
        communicationDevice = this.audioManager.setCommunicationDevice(audioDeviceInfo);
        return communicationDevice;
    }
}
