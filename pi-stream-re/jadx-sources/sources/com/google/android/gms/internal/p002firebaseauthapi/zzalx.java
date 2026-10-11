package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import com.google.android.gms.internal.p002firebaseauthapi.zzaja;

/* loaded from: classes.dex */
final class zzalx {
    public static String zza(zzahm zzahmVar) {
        zzalw zzalwVar = new zzalw(zzahmVar);
        StringBuilder sb = new StringBuilder(zzalwVar.zza());
        for (int i10 = 0; i10 < zzalwVar.zza(); i10++) {
            byte zza = zzalwVar.zza(i10);
            if (zza != 34) {
                if (zza != 39) {
                    if (zza != 92) {
                        switch (zza) {
                            case zzaja.zze.zzg /* 7 */:
                                sb.append("\\a");
                                break;
                            case 8:
                                sb.append("\\b");
                                break;
                            case 9:
                                sb.append("\\t");
                                break;
                            case 10:
                                sb.append("\\n");
                                break;
                            case ModuleDescriptor.MODULE_VERSION /* 11 */:
                                sb.append("\\v");
                                break;
                            case 12:
                                sb.append("\\f");
                                break;
                            case 13:
                                sb.append("\\r");
                                break;
                            default:
                                if (zza >= 32 && zza <= 126) {
                                    sb.append((char) zza);
                                    break;
                                } else {
                                    sb.append('\\');
                                    sb.append((char) (((zza >>> 6) & 3) + 48));
                                    sb.append((char) (((zza >>> 3) & 7) + 48));
                                    sb.append((char) ((zza & 7) + 48));
                                    break;
                                }
                        }
                    } else {
                        sb.append("\\\\");
                    }
                } else {
                    sb.append("\\'");
                }
            } else {
                sb.append("\\\"");
            }
        }
        return sb.toString();
    }
}
