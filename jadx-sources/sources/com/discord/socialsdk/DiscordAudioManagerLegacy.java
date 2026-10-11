package com.discord.socialsdk;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.util.Log;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public class DiscordAudioManagerLegacy extends DiscordAudioManagerInterface {
    private static DiscordAudioManagerLegacy instance;
    private boolean scoAvailableOffCall;
    private final BroadcastReceiver scoStateReceiver;

    private DiscordAudioManagerLegacy(Context context) {
        super(context);
        this.scoAvailableOffCall = false;
        updateAudioDevices();
        this.scoStateReceiver = new BroadcastReceiver() { // from class: com.discord.socialsdk.DiscordAudioManagerLegacy.1
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context2, Intent intent) {
                if ("android.media.ACTION_SCO_AUDIO_STATE_UPDATED".equals(intent.getAction())) {
                    int intExtra = intent.getIntExtra("android.media.extra.SCO_AUDIO_STATE", -1);
                    int intExtra2 = intent.getIntExtra("android.media.extra.SCO_AUDIO_PREVIOUS_STATE", -1);
                    if (intExtra == 0 && intExtra2 == 2) {
                        Log.e("DiscordSocialSdk", "SCO connection failed, updating audio routing");
                        DiscordAudioManagerLegacy.this.updateActiveAudioDevice();
                    }
                }
            }
        };
    }

    public static DiscordAudioManagerLegacy getInstance(Context context) {
        DiscordAudioManagerLegacy discordAudioManagerLegacy = instance;
        if (discordAudioManagerLegacy == null) {
            Log.d("DiscordSocialSdk", "Creating new DiscordAudioManagerLegacy instance");
            DiscordAudioManagerLegacy discordAudioManagerLegacy2 = new DiscordAudioManagerLegacy(context);
            instance = discordAudioManagerLegacy2;
            return discordAudioManagerLegacy2;
        }
        return discordAudioManagerLegacy;
    }

    @Override // com.discord.socialsdk.DiscordAudioManagerInterface
    public AudioDeviceInfo[] androidGetAudioDevices() {
        return this.audioManager.getDevices(2);
    }

    @Override // com.discord.socialsdk.DiscordAudioManagerInterface
    public void setActiveCall(boolean z) {
        this.isActiveCall = z;
        AudioManager audioManager = this.audioManager;
        if (z) {
            boolean isBluetoothScoAvailableOffCall = audioManager.isBluetoothScoAvailableOffCall();
            this.scoAvailableOffCall = isBluetoothScoAvailableOffCall;
            if (isBluetoothScoAvailableOffCall) {
                this.context.registerReceiver(this.scoStateReceiver, new IntentFilter("android.media.ACTION_SCO_AUDIO_STATE_UPDATED"));
            }
            this.audioManager.registerAudioDeviceCallback(this.audioDeviceCallback, null);
            updateAudioDevices();
            updateAudioModeForCurrentState();
            updateActiveAudioDevice();
            return;
        }
        if (audioManager.isBluetoothScoOn()) {
            this.audioManager.stopBluetoothSco();
            this.audioManager.setBluetoothScoOn(false);
        }
        if (this.scoAvailableOffCall) {
            this.context.unregisterReceiver(this.scoStateReceiver);
        }
        this.audioManager.unregisterAudioDeviceCallback(this.audioDeviceCallback);
        updateAudioModeForCurrentState();
    }

    @Override // com.discord.socialsdk.DiscordAudioManagerInterface
    public boolean setActiveDevice(AudioDeviceInfo audioDeviceInfo) {
        if (audioDeviceInfo == null) {
            return false;
        }
        Log.d("DiscordSocialSdk", "setActiveDevice to type: " + audioDeviceInfo.getType());
        DiscordDeviceType orDefault = DeviceInfoToDiscordDeviceType.mapping.getOrDefault(Integer.valueOf(audioDeviceInfo.getType()), DiscordDeviceType.INVALID);
        if (orDefault == DiscordDeviceType.WIRED_HEADSET) {
            this.audioManager.setSpeakerphoneOn(false);
            this.audioManager.stopBluetoothSco();
            this.audioManager.setBluetoothScoOn(false);
            return true;
        }
        DiscordDeviceType discordDeviceType = DiscordDeviceType.BLUETOOTH_HEADSET;
        AudioManager audioManager = this.audioManager;
        if (orDefault == discordDeviceType) {
            audioManager.setSpeakerphoneOn(false);
            if (!this.scoAvailableOffCall) {
                Log.e("DiscordSocialSdk", "Bluetooth SCO not available off call, can't activate SCO device");
                return false;
            }
            this.audioManager.setBluetoothScoOn(true);
            this.audioManager.startBluetoothSco();
            return true;
        }
        audioManager.setSpeakerphoneOn(true);
        this.audioManager.stopBluetoothSco();
        this.audioManager.setBluetoothScoOn(false);
        return true;
    }
}
