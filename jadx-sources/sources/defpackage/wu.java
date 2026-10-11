package defpackage;

import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class wu extends AudioDeviceCallback {
    public final /* synthetic */ ak6 a;

    public wu(ak6 ak6Var) {
        this.a = ak6Var;
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
        this.a.i();
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
        ak6 ak6Var = this.a;
        if (eq6.m(audioDeviceInfoArr, (AudioDeviceInfo) ak6Var.j)) {
            ak6Var.j = null;
        }
        ak6Var.i();
    }
}
