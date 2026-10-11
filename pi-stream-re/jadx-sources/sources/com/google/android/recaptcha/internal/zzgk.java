package com.google.android.recaptcha.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzgk {
    public static int zza(byte[] bArr, int i10, zzgj zzgjVar) {
        int zzi = zzi(bArr, i10, zzgjVar);
        int i11 = zzgjVar.zza;
        if (i11 >= 0) {
            if (i11 <= bArr.length - zzi) {
                if (i11 == 0) {
                    zzgjVar.zzc = zzgw.zzb;
                    return zzi;
                }
                zzgjVar.zzc = zzgw.zzm(bArr, zzi, i11);
                return zzi + i11;
            }
            throw zzje.zzj();
        }
        throw zzje.zzf();
    }

    public static int zzb(byte[] bArr, int i10) {
        int i11 = bArr[i10] & 255;
        int i12 = bArr[i10 + 1] & 255;
        int i13 = bArr[i10 + 2] & 255;
        return ((bArr[i10 + 3] & 255) << 24) | (i12 << 8) | i11 | (i13 << 16);
    }

    public static int zzc(zzkr zzkrVar, byte[] bArr, int i10, int i11, int i12, zzgj zzgjVar) {
        Object zze = zzkrVar.zze();
        int zzm = zzm(zze, zzkrVar, bArr, i10, i11, i12, zzgjVar);
        zzkrVar.zzf(zze);
        zzgjVar.zzc = zze;
        return zzm;
    }

    public static int zzd(zzkr zzkrVar, byte[] bArr, int i10, int i11, zzgj zzgjVar) {
        Object zze = zzkrVar.zze();
        int zzn = zzn(zze, zzkrVar, bArr, i10, i11, zzgjVar);
        zzkrVar.zzf(zze);
        zzgjVar.zzc = zze;
        return zzn;
    }

    public static int zze(zzkr zzkrVar, int i10, byte[] bArr, int i11, int i12, zzjb zzjbVar, zzgj zzgjVar) {
        int zzd = zzd(zzkrVar, bArr, i11, i12, zzgjVar);
        zzjbVar.add(zzgjVar.zzc);
        while (zzd < i12) {
            int zzi = zzi(bArr, zzd, zzgjVar);
            if (i10 != zzgjVar.zza) {
                break;
            }
            zzd = zzd(zzkrVar, bArr, zzi, i12, zzgjVar);
            zzjbVar.add(zzgjVar.zzc);
        }
        return zzd;
    }

    public static int zzf(byte[] bArr, int i10, zzjb zzjbVar, zzgj zzgjVar) {
        zziu zziuVar = (zziu) zzjbVar;
        int zzi = zzi(bArr, i10, zzgjVar);
        int i11 = zzgjVar.zza + zzi;
        while (zzi < i11) {
            zzi = zzi(bArr, zzi, zzgjVar);
            zziuVar.zzg(zzgjVar.zza);
        }
        if (zzi == i11) {
            return zzi;
        }
        throw zzje.zzj();
    }

    public static int zzg(byte[] bArr, int i10, zzgj zzgjVar) {
        int zzi = zzi(bArr, i10, zzgjVar);
        int i11 = zzgjVar.zza;
        if (i11 >= 0) {
            if (i11 == 0) {
                zzgjVar.zzc = "";
                return zzi;
            }
            zzgjVar.zzc = new String(bArr, zzi, i11, zzjc.zzb);
            return zzi + i11;
        }
        throw zzje.zzf();
    }

    public static int zzh(int i10, byte[] bArr, int i11, int i12, zzlm zzlmVar, zzgj zzgjVar) {
        if ((i10 >>> 3) != 0) {
            int i13 = i10 & 7;
            if (i13 != 0) {
                if (i13 != 1) {
                    if (i13 != 2) {
                        if (i13 != 3) {
                            if (i13 == 5) {
                                zzlmVar.zzj(i10, Integer.valueOf(zzb(bArr, i11)));
                                return i11 + 4;
                            }
                            throw zzje.zzc();
                        }
                        int i14 = (i10 & (-8)) | 4;
                        zzlm zzf = zzlm.zzf();
                        int i15 = 0;
                        while (true) {
                            if (i11 >= i12) {
                                break;
                            }
                            int zzi = zzi(bArr, i11, zzgjVar);
                            int i16 = zzgjVar.zza;
                            i15 = i16;
                            if (i16 != i14) {
                                int zzh = zzh(i15, bArr, zzi, i12, zzf, zzgjVar);
                                i15 = i16;
                                i11 = zzh;
                            } else {
                                i11 = zzi;
                                break;
                            }
                        }
                        if (i11 <= i12 && i15 == i14) {
                            zzlmVar.zzj(i10, zzf);
                            return i11;
                        }
                        throw zzje.zzg();
                    }
                    int zzi2 = zzi(bArr, i11, zzgjVar);
                    int i17 = zzgjVar.zza;
                    if (i17 >= 0) {
                        if (i17 <= bArr.length - zzi2) {
                            if (i17 == 0) {
                                zzlmVar.zzj(i10, zzgw.zzb);
                            } else {
                                zzlmVar.zzj(i10, zzgw.zzm(bArr, zzi2, i17));
                            }
                            return zzi2 + i17;
                        }
                        throw zzje.zzj();
                    }
                    throw zzje.zzf();
                }
                zzlmVar.zzj(i10, Long.valueOf(zzp(bArr, i11)));
                return i11 + 8;
            }
            int zzl = zzl(bArr, i11, zzgjVar);
            zzlmVar.zzj(i10, Long.valueOf(zzgjVar.zzb));
            return zzl;
        }
        throw zzje.zzc();
    }

    public static int zzi(byte[] bArr, int i10, zzgj zzgjVar) {
        int i11 = i10 + 1;
        byte b10 = bArr[i10];
        if (b10 >= 0) {
            zzgjVar.zza = b10;
            return i11;
        }
        return zzj(b10, bArr, i11, zzgjVar);
    }

    public static int zzj(int i10, byte[] bArr, int i11, zzgj zzgjVar) {
        byte b10 = bArr[i11];
        int i12 = i11 + 1;
        int i13 = i10 & 127;
        if (b10 >= 0) {
            zzgjVar.zza = i13 | (b10 << 7);
            return i12;
        }
        int i14 = i13 | ((b10 & Byte.MAX_VALUE) << 7);
        int i15 = i12 + 1;
        byte b11 = bArr[i12];
        if (b11 >= 0) {
            zzgjVar.zza = i14 | (b11 << 14);
            return i15;
        }
        int i16 = i14 | ((b11 & Byte.MAX_VALUE) << 14);
        int i17 = i15 + 1;
        byte b12 = bArr[i15];
        if (b12 >= 0) {
            zzgjVar.zza = i16 | (b12 << 21);
            return i17;
        }
        int i18 = i16 | ((b12 & Byte.MAX_VALUE) << 21);
        int i19 = i17 + 1;
        byte b13 = bArr[i17];
        if (b13 >= 0) {
            zzgjVar.zza = i18 | (b13 << 28);
            return i19;
        }
        int i20 = i18 | ((b13 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i21 = i19 + 1;
            if (bArr[i19] < 0) {
                i19 = i21;
            } else {
                zzgjVar.zza = i20;
                return i21;
            }
        }
    }

    public static int zzk(int i10, byte[] bArr, int i11, int i12, zzjb zzjbVar, zzgj zzgjVar) {
        zziu zziuVar = (zziu) zzjbVar;
        int zzi = zzi(bArr, i11, zzgjVar);
        zziuVar.zzg(zzgjVar.zza);
        while (zzi < i12) {
            int zzi2 = zzi(bArr, zzi, zzgjVar);
            if (i10 != zzgjVar.zza) {
                break;
            }
            zzi = zzi(bArr, zzi2, zzgjVar);
            zziuVar.zzg(zzgjVar.zza);
        }
        return zzi;
    }

    public static int zzl(byte[] bArr, int i10, zzgj zzgjVar) {
        long j4 = bArr[i10];
        int i11 = i10 + 1;
        if (j4 >= 0) {
            zzgjVar.zzb = j4;
            return i11;
        }
        int i12 = i11 + 1;
        byte b10 = bArr[i11];
        long j10 = (j4 & 127) | ((b10 & Byte.MAX_VALUE) << 7);
        int i13 = 7;
        while (b10 < 0) {
            int i14 = i12 + 1;
            byte b11 = bArr[i12];
            i13 += 7;
            j10 |= (b11 & Byte.MAX_VALUE) << i13;
            i12 = i14;
            b10 = b11;
        }
        zzgjVar.zzb = j10;
        return i12;
    }

    public static int zzm(Object obj, zzkr zzkrVar, byte[] bArr, int i10, int i11, int i12, zzgj zzgjVar) {
        int zzc = ((zzkh) zzkrVar).zzc(obj, bArr, i10, i11, i12, zzgjVar);
        zzgjVar.zzc = obj;
        return zzc;
    }

    public static int zzn(Object obj, zzkr zzkrVar, byte[] bArr, int i10, int i11, zzgj zzgjVar) {
        int i12 = i10 + 1;
        int i13 = bArr[i10];
        if (i13 < 0) {
            i12 = zzj(i13, bArr, i12, zzgjVar);
            i13 = zzgjVar.zza;
        }
        int i14 = i12;
        if (i13 >= 0 && i13 <= i11 - i14) {
            int i15 = i13 + i14;
            zzkrVar.zzi(obj, bArr, i14, i15, zzgjVar);
            zzgjVar.zzc = obj;
            return i15;
        }
        throw zzje.zzj();
    }

    public static int zzo(int i10, byte[] bArr, int i11, int i12, zzgj zzgjVar) {
        if ((i10 >>> 3) != 0) {
            int i13 = i10 & 7;
            if (i13 != 0) {
                if (i13 != 1) {
                    if (i13 != 2) {
                        if (i13 != 3) {
                            if (i13 == 5) {
                                return i11 + 4;
                            }
                            throw zzje.zzc();
                        }
                        int i14 = (i10 & (-8)) | 4;
                        int i15 = 0;
                        while (i11 < i12) {
                            i11 = zzi(bArr, i11, zzgjVar);
                            i15 = zzgjVar.zza;
                            if (i15 == i14) {
                                break;
                            }
                            i11 = zzo(i15, bArr, i11, i12, zzgjVar);
                        }
                        if (i11 <= i12 && i15 == i14) {
                            return i11;
                        }
                        throw zzje.zzg();
                    }
                    return zzi(bArr, i11, zzgjVar) + zzgjVar.zza;
                }
                return i11 + 8;
            }
            return zzl(bArr, i11, zzgjVar);
        }
        throw zzje.zzc();
    }

    public static long zzp(byte[] bArr, int i10) {
        return (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16) | ((bArr[i10 + 3] & 255) << 24) | ((bArr[i10 + 4] & 255) << 32) | ((bArr[i10 + 5] & 255) << 40) | ((bArr[i10 + 6] & 255) << 48) | ((bArr[i10 + 7] & 255) << 56);
    }
}
