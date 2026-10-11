package defpackage;

import android.media.AudioFocusRequest;
import android.os.Handler;
import java.util.Objects;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class cv {
    public final int a;
    public final zu b;
    public final Handler c;
    public final ru d;
    public final boolean e;
    public final AudioFocusRequest f;

    public cv(int i, zu zuVar, Handler handler, ru ruVar, boolean z, boolean z2) {
        this.a = i;
        this.c = handler;
        this.d = ruVar;
        this.e = z;
        this.b = zuVar;
        this.f = new AudioFocusRequest.Builder(i).setAudioAttributes(ruVar.b()).setWillPauseWhenDucked(z).setOnAudioFocusChangeListener(zuVar, handler).setAcceptsDelayedFocusGain(z2).build();
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof cv) {
                cv cvVar = (cv) obj;
                if (this.a == cvVar.a && this.e == cvVar.e && this.b == cvVar.b && this.c.equals(cvVar.c) && Objects.equals(this.d, cvVar.d)) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.a), this.b, this.c, this.d, Boolean.valueOf(this.e));
    }
}
