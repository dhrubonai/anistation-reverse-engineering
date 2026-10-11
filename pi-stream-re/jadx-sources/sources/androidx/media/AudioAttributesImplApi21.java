package androidx.media;

import android.media.AudioAttributes;

/* loaded from: classes.dex */
public class AudioAttributesImplApi21 implements AudioAttributesImpl {

    /* renamed from: a, reason: collision with root package name */
    public AudioAttributes f1172a;

    /* renamed from: b, reason: collision with root package name */
    public int f1173b = -1;

    public final boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesImplApi21)) {
            return false;
        }
        return this.f1172a.equals(((AudioAttributesImplApi21) obj).f1172a);
    }

    public final int hashCode() {
        return this.f1172a.hashCode();
    }

    public final String toString() {
        return "AudioAttributesCompat: audioattributes=" + this.f1172a;
    }
}
