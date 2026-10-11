package androidx.media;

import a3.g;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import com.google.android.gms.internal.p002firebaseauthapi.zzaja;
import java.util.Arrays;

/* loaded from: classes.dex */
public class AudioAttributesImplBase implements AudioAttributesImpl {

    /* renamed from: a, reason: collision with root package name */
    public int f1174a = 0;

    /* renamed from: b, reason: collision with root package name */
    public int f1175b = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f1176c = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f1177d = -1;

    public final boolean equals(Object obj) {
        int i10;
        if (!(obj instanceof AudioAttributesImplBase)) {
            return false;
        }
        AudioAttributesImplBase audioAttributesImplBase = (AudioAttributesImplBase) obj;
        if (this.f1175b != audioAttributesImplBase.f1175b) {
            return false;
        }
        int i11 = this.f1176c;
        int i12 = audioAttributesImplBase.f1176c;
        int i13 = audioAttributesImplBase.f1177d;
        if (i13 != -1) {
            i10 = i13;
        } else {
            int i14 = audioAttributesImplBase.f1174a;
            int i15 = AudioAttributesCompat.f1170b;
            if ((i12 & 1) == 1) {
                i10 = 7;
            } else {
                i10 = 4;
                if ((i12 & 4) == 4) {
                    i10 = 6;
                } else {
                    switch (i14) {
                        case 2:
                            i10 = 0;
                            break;
                        case 3:
                            i10 = 8;
                            break;
                        case 4:
                            break;
                        case 5:
                        case zzaja.zze.zzg /* 7 */:
                        case 8:
                        case 9:
                        case 10:
                            i10 = 5;
                            break;
                        case 6:
                            i10 = 2;
                            break;
                        case ModuleDescriptor.MODULE_VERSION /* 11 */:
                            i10 = 10;
                            break;
                        case 12:
                        default:
                            i10 = 3;
                            break;
                        case 13:
                            i10 = 1;
                            break;
                    }
                }
            }
        }
        if (i10 == 6) {
            i12 |= 4;
        } else if (i10 == 7) {
            i12 |= 1;
        }
        if (i11 != (i12 & 273) || this.f1174a != audioAttributesImplBase.f1174a || this.f1177d != i13) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f1175b), Integer.valueOf(this.f1176c), Integer.valueOf(this.f1174a), Integer.valueOf(this.f1177d)});
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("AudioAttributesCompat:");
        if (this.f1177d != -1) {
            sb.append(" stream=");
            sb.append(this.f1177d);
            sb.append(" derived");
        }
        sb.append(" usage=");
        int i10 = this.f1174a;
        int i11 = AudioAttributesCompat.f1170b;
        switch (i10) {
            case 0:
                str = "USAGE_UNKNOWN";
                break;
            case 1:
                str = "USAGE_MEDIA";
                break;
            case 2:
                str = "USAGE_VOICE_COMMUNICATION";
                break;
            case 3:
                str = "USAGE_VOICE_COMMUNICATION_SIGNALLING";
                break;
            case 4:
                str = "USAGE_ALARM";
                break;
            case 5:
                str = "USAGE_NOTIFICATION";
                break;
            case 6:
                str = "USAGE_NOTIFICATION_RINGTONE";
                break;
            case zzaja.zze.zzg /* 7 */:
                str = "USAGE_NOTIFICATION_COMMUNICATION_REQUEST";
                break;
            case 8:
                str = "USAGE_NOTIFICATION_COMMUNICATION_INSTANT";
                break;
            case 9:
                str = "USAGE_NOTIFICATION_COMMUNICATION_DELAYED";
                break;
            case 10:
                str = "USAGE_NOTIFICATION_EVENT";
                break;
            case ModuleDescriptor.MODULE_VERSION /* 11 */:
                str = "USAGE_ASSISTANCE_ACCESSIBILITY";
                break;
            case 12:
                str = "USAGE_ASSISTANCE_NAVIGATION_GUIDANCE";
                break;
            case 13:
                str = "USAGE_ASSISTANCE_SONIFICATION";
                break;
            case 14:
                str = "USAGE_GAME";
                break;
            case 15:
            default:
                str = g.n("unknown usage ", i10);
                break;
            case 16:
                str = "USAGE_ASSISTANT";
                break;
        }
        sb.append(str);
        sb.append(" content=");
        sb.append(this.f1175b);
        sb.append(" flags=0x");
        sb.append(Integer.toHexString(this.f1176c).toUpperCase());
        return sb.toString();
    }
}
