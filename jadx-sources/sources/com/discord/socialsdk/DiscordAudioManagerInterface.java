package com.discord.socialsdk;

import android.content.Context;
import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.util.Log;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class DiscordAudioManagerInterface {
    protected static final String TAG = "DiscordSocialSdk";
    protected final AudioManager audioManager;
    protected final Context context;
    protected final HashSet<AudioDeviceInfo> audioDevices = new HashSet<>();
    protected boolean preventCommsForBluetooth = false;
    protected boolean isActiveCall = false;
    protected int expectedMode = 0;
    protected final AudioDeviceCallback audioDeviceCallback = new AudioDeviceCallback() { // from class: com.discord.socialsdk.DiscordAudioManagerInterface.1
        @Override // android.media.AudioDeviceCallback
        public void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
            if (audioDeviceInfoArr != null && audioDeviceInfoArr.length > 0) {
                for (AudioDeviceInfo audioDeviceInfo : audioDeviceInfoArr) {
                    if (audioDeviceInfo.isSink()) {
                        DiscordAudioManagerInterface.this.audioDevices.add(audioDeviceInfo);
                    }
                }
                DiscordAudioManagerInterface.this.updateAudioModeForCurrentState();
                DiscordAudioManagerInterface.this.updateActiveAudioDevice();
            }
        }

        @Override // android.media.AudioDeviceCallback
        public void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
            if (audioDeviceInfoArr != null && audioDeviceInfoArr.length > 0) {
                for (AudioDeviceInfo audioDeviceInfo : audioDeviceInfoArr) {
                    if (audioDeviceInfo.isSink()) {
                        DiscordAudioManagerInterface.this.audioDevices.remove(audioDeviceInfo);
                    }
                }
                DiscordAudioManagerInterface.this.updateAudioModeForCurrentState();
                DiscordAudioManagerInterface.this.updateActiveAudioDevice();
            }
        }
    };

    public DiscordAudioManagerInterface(Context context) {
        this.context = context;
        this.audioManager = (AudioManager) context.getSystemService("audio");
    }

    public abstract AudioDeviceInfo[] androidGetAudioDevices();

    public AudioDeviceInfo findDeviceOfType(DiscordDeviceType discordDeviceType) {
        Iterator<AudioDeviceInfo> it = this.audioDevices.iterator();
        while (it.hasNext()) {
            AudioDeviceInfo next = it.next();
            if (DeviceInfoToDiscordDeviceType.mapping.getOrDefault(Integer.valueOf(next.getType()), DiscordDeviceType.INVALID) == discordDeviceType) {
                return next;
            }
        }
        return null;
    }

    public boolean isBluetoothConnected() {
        if (findDeviceOfType(DiscordDeviceType.BLUETOOTH_HEADSET) != null) {
            return true;
        }
        return false;
    }

    public abstract void setActiveCall(boolean z);

    public abstract boolean setActiveDevice(AudioDeviceInfo audioDeviceInfo);

    public void setPreventCommsForBluetooth(boolean z) {
        this.preventCommsForBluetooth = z;
    }

    public void updateActiveAudioDevice() {
        if (this.expectedMode != 0) {
            AudioDeviceInfo findDeviceOfType = findDeviceOfType(DiscordDeviceType.WIRED_HEADSET);
            if (findDeviceOfType == null || !setActiveDevice(findDeviceOfType)) {
                AudioDeviceInfo findDeviceOfType2 = findDeviceOfType(DiscordDeviceType.BLUETOOTH_HEADSET);
                if (findDeviceOfType2 == null || !setActiveDevice(findDeviceOfType2)) {
                    AudioDeviceInfo findDeviceOfType3 = findDeviceOfType(DiscordDeviceType.BUILTIN_SPEAKER);
                    if (findDeviceOfType3 != null && setActiveDevice(findDeviceOfType3)) {
                        return;
                    }
                    Log.e(TAG, "Unable to set active device");
                }
            }
        }
    }

    public void updateAudioDevices() {
        this.audioDevices.clear();
        for (AudioDeviceInfo audioDeviceInfo : androidGetAudioDevices()) {
            if (audioDeviceInfo.isSink()) {
                this.audioDevices.add(audioDeviceInfo);
            }
        }
    }

    public void updateAudioModeForCurrentState() {
        boolean z;
        if (this.isActiveCall) {
            if (this.preventCommsForBluetooth && isBluetoothConnected()) {
                z = false;
            } else {
                z = true;
            }
            if (z && this.expectedMode != 3) {
                Log.d(TAG, "Bluetooth not connected, switching to communication mode");
                this.expectedMode = 3;
                this.audioManager.setMode(3);
                return;
            } else {
                if (!z && this.expectedMode == 3) {
                    Log.d(TAG, "Bluetooth connected and preventCommsForBluetooth=true, switching to normal mode");
                    this.expectedMode = 0;
                    this.audioManager.setMode(0);
                    return;
                }
                return;
            }
        }
        if (this.expectedMode != 0) {
            Log.d(TAG, "Active call ended, switching to normal mode");
            this.expectedMode = 0;
            this.audioManager.setMode(0);
        }
    }
}
