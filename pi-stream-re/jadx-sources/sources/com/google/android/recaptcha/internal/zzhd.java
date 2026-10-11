package com.google.android.recaptcha.internal;

import com.google.android.gms.common.api.f;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzhd implements zzkq {
    private final zzhc zza;
    private int zzb;
    private int zzc;
    private int zzd = 0;

    private zzhd(zzhc zzhcVar) {
        byte[] bArr = zzjc.zzd;
        this.zza = zzhcVar;
        zzhcVar.zzc = this;
    }

    private final void zzP(Object obj, zzkr zzkrVar, zzie zzieVar) {
        int i10 = this.zzc;
        this.zzc = ((this.zzb >>> 3) << 3) | 4;
        try {
            zzkrVar.zzh(obj, this, zzieVar);
            if (this.zzb == this.zzc) {
            } else {
                throw zzje.zzg();
            }
        } finally {
            this.zzc = i10;
        }
    }

    private final void zzQ(Object obj, zzkr zzkrVar, zzie zzieVar) {
        zzhc zzhcVar = this.zza;
        int zzn = zzhcVar.zzn();
        if (zzhcVar.zza < zzhcVar.zzb) {
            int zze = this.zza.zze(zzn);
            this.zza.zza++;
            zzkrVar.zzh(obj, this, zzieVar);
            this.zza.zzz(0);
            r4.zza--;
            this.zza.zzA(zze);
            return;
        }
        throw new zzje("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    private final void zzR(int i10) {
        if (this.zza.zzd() == i10) {
        } else {
            throw zzje.zzj();
        }
    }

    private final void zzS(int i10) {
        if ((this.zzb & 7) == i10) {
        } else {
            throw zzje.zza();
        }
    }

    private static final void zzT(int i10) {
        if ((i10 & 3) == 0) {
        } else {
            throw zzje.zzg();
        }
    }

    private static final void zzU(int i10) {
        if ((i10 & 7) == 0) {
        } else {
            throw zzje.zzg();
        }
    }

    public static zzhd zzq(zzhc zzhcVar) {
        zzhd zzhdVar = zzhcVar.zzc;
        if (zzhdVar != null) {
            return zzhdVar;
        }
        return new zzhd(zzhcVar);
    }

    @Override // com.google.android.recaptcha.internal.zzkq
    public final void zzA(List list) {
        int zzm;
        int i10;
        if (list instanceof zzjt) {
            zzjt zzjtVar = (zzjt) list;
            int i11 = this.zzb & 7;
            if (i11 != 1) {
                if (i11 == 2) {
                    int zzn = this.zza.zzn();
                    zzU(zzn);
                    int zzd = this.zza.zzd() + zzn;
                    do {
                        zzjtVar.zzg(this.zza.zzo());
                    } while (this.zza.zzd() < zzd);
                    return;
                }
                throw zzje.zza();
            }
            do {
                zzjtVar.zzg(this.zza.zzo());
                if (!this.zza.zzC()) {
                    i10 = this.zza.zzm();
                } else {
                    return;
                }
            } while (i10 == this.zzb);
        } else {
            int i12 = this.zzb & 7;
            if (i12 != 1) {
                if (i12 == 2) {
                    int zzn2 = this.zza.zzn();
                    zzU(zzn2);
                    int zzd2 = this.zza.zzd() + zzn2;
                    do {
                        list.add(Long.valueOf(this.zza.zzo()));
                    } while (this.zza.zzd() < zzd2);
                    return;
                }
                throw zzje.zza();
            }
            do {
                list.add(Long.valueOf(this.zza.zzo()));
                if (!this.zza.zzC()) {
                    zzm = this.zza.zzm();
                } else {
                    return;
                }
            } while (zzm == this.zzb);
            i10 = zzm;
        }
        this.zzd = i10;
    }

    @Override // com.google.android.recaptcha.internal.zzkq
    public final void zzB(List list) {
        int zzm;
        int i10;
        if (list instanceof zzil) {
            zzil zzilVar = (zzil) list;
            int i11 = this.zzb & 7;
            if (i11 != 2) {
                if (i11 != 5) {
                    throw zzje.zza();
                }
                do {
                    zzilVar.zze(this.zza.zzc());
                    if (!this.zza.zzC()) {
                        i10 = this.zza.zzm();
                    } else {
                        return;
                    }
                } while (i10 == this.zzb);
            } else {
                int zzn = this.zza.zzn();
                zzT(zzn);
                int zzd = this.zza.zzd() + zzn;
                do {
                    zzilVar.zze(this.zza.zzc());
                } while (this.zza.zzd() < zzd);
                return;
            }
        } else {
            int i12 = this.zzb & 7;
            if (i12 != 2) {
                if (i12 != 5) {
                    throw zzje.zza();
                }
                do {
                    list.add(Float.valueOf(this.zza.zzc()));
                    if (!this.zza.zzC()) {
                        zzm = this.zza.zzm();
                    } else {
                        return;
                    }
                } while (zzm == this.zzb);
                i10 = zzm;
            } else {
                int zzn2 = this.zza.zzn();
                zzT(zzn2);
                int zzd2 = this.zza.zzd() + zzn2;
                do {
                    list.add(Float.valueOf(this.zza.zzc()));
                } while (this.zza.zzd() < zzd2);
                return;
            }
        }
        this.zzd = i10;
    }

    @Override // com.google.android.recaptcha.internal.zzkq
    @Deprecated
    public final void zzC(List list, zzkr zzkrVar, zzie zzieVar) {
        int zzm;
        int i10 = this.zzb;
        if ((i10 & 7) != 3) {
            throw zzje.zza();
        }
        do {
            Object zze = zzkrVar.zze();
            zzP(zze, zzkrVar, zzieVar);
            zzkrVar.zzf(zze);
            list.add(zze);
            if (!this.zza.zzC() && this.zzd == 0) {
                zzm = this.zza.zzm();
            } else {
                return;
            }
        } while (zzm == i10);
        this.zzd = zzm;
    }

    @Override // com.google.android.recaptcha.internal.zzkq
    public final void zzD(List list) {
        int zzm;
        int i10;
        if (list instanceof zziu) {
            zziu zziuVar = (zziu) list;
            int i11 = this.zzb & 7;
            if (i11 != 0) {
                if (i11 == 2) {
                    zzhc zzhcVar = this.zza;
                    int zzd = zzhcVar.zzd() + zzhcVar.zzn();
                    do {
                        zziuVar.zzg(this.zza.zzh());
                    } while (this.zza.zzd() < zzd);
                    zzR(zzd);
                    return;
                }
                throw zzje.zza();
            }
            do {
                zziuVar.zzg(this.zza.zzh());
                if (!this.zza.zzC()) {
                    i10 = this.zza.zzm();
                } else {
                    return;
                }
            } while (i10 == this.zzb);
        } else {
            int i12 = this.zzb & 7;
            if (i12 != 0) {
                if (i12 == 2) {
                    zzhc zzhcVar2 = this.zza;
                    int zzd2 = zzhcVar2.zzd() + zzhcVar2.zzn();
                    do {
                        list.add(Integer.valueOf(this.zza.zzh()));
                    } while (this.zza.zzd() < zzd2);
                    zzR(zzd2);
                    return;
                }
                throw zzje.zza();
            }
            do {
                list.add(Integer.valueOf(this.zza.zzh()));
                if (!this.zza.zzC()) {
                    zzm = this.zza.zzm();
                } else {
                    return;
                }
            } while (zzm == this.zzb);
            i10 = zzm;
        }
        this.zzd = i10;
    }

    @Override // com.google.android.recaptcha.internal.zzkq
    public final void zzE(List list) {
        int zzm;
        int i10;
        if (list instanceof zzjt) {
            zzjt zzjtVar = (zzjt) list;
            int i11 = this.zzb & 7;
            if (i11 != 0) {
                if (i11 == 2) {
                    zzhc zzhcVar = this.zza;
                    int zzd = zzhcVar.zzd() + zzhcVar.zzn();
                    do {
                        zzjtVar.zzg(this.zza.zzp());
                    } while (this.zza.zzd() < zzd);
                    zzR(zzd);
                    return;
                }
                throw zzje.zza();
            }
            do {
                zzjtVar.zzg(this.zza.zzp());
                if (!this.zza.zzC()) {
                    i10 = this.zza.zzm();
                } else {
                    return;
                }
            } while (i10 == this.zzb);
        } else {
            int i12 = this.zzb & 7;
            if (i12 != 0) {
                if (i12 == 2) {
                    zzhc zzhcVar2 = this.zza;
                    int zzd2 = zzhcVar2.zzd() + zzhcVar2.zzn();
                    do {
                        list.add(Long.valueOf(this.zza.zzp()));
                    } while (this.zza.zzd() < zzd2);
                    zzR(zzd2);
                    return;
                }
                throw zzje.zza();
            }
            do {
                list.add(Long.valueOf(this.zza.zzp()));
                if (!this.zza.zzC()) {
                    zzm = this.zza.zzm();
                } else {
                    return;
                }
            } while (zzm == this.zzb);
            i10 = zzm;
        }
        this.zzd = i10;
    }

    @Override // com.google.android.recaptcha.internal.zzkq
    public final void zzF(List list, zzkr zzkrVar, zzie zzieVar) {
        int zzm;
        int i10 = this.zzb;
        if ((i10 & 7) != 2) {
            throw zzje.zza();
        }
        do {
            Object zze = zzkrVar.zze();
            zzQ(zze, zzkrVar, zzieVar);
            zzkrVar.zzf(zze);
            list.add(zze);
            if (!this.zza.zzC() && this.zzd == 0) {
                zzm = this.zza.zzm();
            } else {
                return;
            }
        } while (zzm == i10);
        this.zzd = zzm;
    }

    @Override // com.google.android.recaptcha.internal.zzkq
    public final void zzG(List list) {
        int zzm;
        int i10;
        if (list instanceof zziu) {
            zziu zziuVar = (zziu) list;
            int i11 = this.zzb & 7;
            if (i11 != 2) {
                if (i11 != 5) {
                    throw zzje.zza();
                }
                do {
                    zziuVar.zzg(this.zza.zzk());
                    if (!this.zza.zzC()) {
                        i10 = this.zza.zzm();
                    } else {
                        return;
                    }
                } while (i10 == this.zzb);
            } else {
                int zzn = this.zza.zzn();
                zzT(zzn);
                int zzd = this.zza.zzd() + zzn;
                do {
                    zziuVar.zzg(this.zza.zzk());
                } while (this.zza.zzd() < zzd);
                return;
            }
        } else {
            int i12 = this.zzb & 7;
            if (i12 != 2) {
                if (i12 != 5) {
                    throw zzje.zza();
                }
                do {
                    list.add(Integer.valueOf(this.zza.zzk()));
                    if (!this.zza.zzC()) {
                        zzm = this.zza.zzm();
                    } else {
                        return;
                    }
                } while (zzm == this.zzb);
                i10 = zzm;
            } else {
                int zzn2 = this.zza.zzn();
                zzT(zzn2);
                int zzd2 = this.zza.zzd() + zzn2;
                do {
                    list.add(Integer.valueOf(this.zza.zzk()));
                } while (this.zza.zzd() < zzd2);
                return;
            }
        }
        this.zzd = i10;
    }

    @Override // com.google.android.recaptcha.internal.zzkq
    public final void zzH(List list) {
        int zzm;
        int i10;
        if (list instanceof zzjt) {
            zzjt zzjtVar = (zzjt) list;
            int i11 = this.zzb & 7;
            if (i11 != 1) {
                if (i11 == 2) {
                    int zzn = this.zza.zzn();
                    zzU(zzn);
                    int zzd = this.zza.zzd() + zzn;
                    do {
                        zzjtVar.zzg(this.zza.zzt());
                    } while (this.zza.zzd() < zzd);
                    return;
                }
                throw zzje.zza();
            }
            do {
                zzjtVar.zzg(this.zza.zzt());
                if (!this.zza.zzC()) {
                    i10 = this.zza.zzm();
                } else {
                    return;
                }
            } while (i10 == this.zzb);
        } else {
            int i12 = this.zzb & 7;
            if (i12 != 1) {
                if (i12 == 2) {
                    int zzn2 = this.zza.zzn();
                    zzU(zzn2);
                    int zzd2 = this.zza.zzd() + zzn2;
                    do {
                        list.add(Long.valueOf(this.zza.zzt()));
                    } while (this.zza.zzd() < zzd2);
                    return;
                }
                throw zzje.zza();
            }
            do {
                list.add(Long.valueOf(this.zza.zzt()));
                if (!this.zza.zzC()) {
                    zzm = this.zza.zzm();
                } else {
                    return;
                }
            } while (zzm == this.zzb);
            i10 = zzm;
        }
        this.zzd = i10;
    }

    @Override // com.google.android.recaptcha.internal.zzkq
    public final void zzI(List list) {
        int zzm;
        int i10;
        if (list instanceof zziu) {
            zziu zziuVar = (zziu) list;
            int i11 = this.zzb & 7;
            if (i11 != 0) {
                if (i11 == 2) {
                    zzhc zzhcVar = this.zza;
                    int zzd = zzhcVar.zzd() + zzhcVar.zzn();
                    do {
                        zziuVar.zzg(this.zza.zzl());
                    } while (this.zza.zzd() < zzd);
                    zzR(zzd);
                    return;
                }
                throw zzje.zza();
            }
            do {
                zziuVar.zzg(this.zza.zzl());
                if (!this.zza.zzC()) {
                    i10 = this.zza.zzm();
                } else {
                    return;
                }
            } while (i10 == this.zzb);
        } else {
            int i12 = this.zzb & 7;
            if (i12 != 0) {
                if (i12 == 2) {
                    zzhc zzhcVar2 = this.zza;
                    int zzd2 = zzhcVar2.zzd() + zzhcVar2.zzn();
                    do {
                        list.add(Integer.valueOf(this.zza.zzl()));
                    } while (this.zza.zzd() < zzd2);
                    zzR(zzd2);
                    return;
                }
                throw zzje.zza();
            }
            do {
                list.add(Integer.valueOf(this.zza.zzl()));
                if (!this.zza.zzC()) {
                    zzm = this.zza.zzm();
                } else {
                    return;
                }
            } while (zzm == this.zzb);
            i10 = zzm;
        }
        this.zzd = i10;
    }

    @Override // com.google.android.recaptcha.internal.zzkq
    public final void zzJ(List list) {
        int zzm;
        int i10;
        if (list instanceof zzjt) {
            zzjt zzjtVar = (zzjt) list;
            int i11 = this.zzb & 7;
            if (i11 != 0) {
                if (i11 == 2) {
                    zzhc zzhcVar = this.zza;
                    int zzd = zzhcVar.zzd() + zzhcVar.zzn();
                    do {
                        zzjtVar.zzg(this.zza.zzu());
                    } while (this.zza.zzd() < zzd);
                    zzR(zzd);
                    return;
                }
                throw zzje.zza();
            }
            do {
                zzjtVar.zzg(this.zza.zzu());
                if (!this.zza.zzC()) {
                    i10 = this.zza.zzm();
                } else {
                    return;
                }
            } while (i10 == this.zzb);
        } else {
            int i12 = this.zzb & 7;
            if (i12 != 0) {
                if (i12 == 2) {
                    zzhc zzhcVar2 = this.zza;
                    int zzd2 = zzhcVar2.zzd() + zzhcVar2.zzn();
                    do {
                        list.add(Long.valueOf(this.zza.zzu()));
                    } while (this.zza.zzd() < zzd2);
                    zzR(zzd2);
                    return;
                }
                throw zzje.zza();
            }
            do {
                list.add(Long.valueOf(this.zza.zzu()));
                if (!this.zza.zzC()) {
                    zzm = this.zza.zzm();
                } else {
                    return;
                }
            } while (zzm == this.zzb);
            i10 = zzm;
        }
        this.zzd = i10;
    }

    public final void zzK(List list, boolean z9) {
        String zzr;
        int zzm;
        int i10;
        if ((this.zzb & 7) == 2) {
            if ((list instanceof zzjm) && !z9) {
                zzjm zzjmVar = (zzjm) list;
                do {
                    zzjmVar.zzi(zzp());
                    if (!this.zza.zzC()) {
                        i10 = this.zza.zzm();
                    } else {
                        return;
                    }
                } while (i10 == this.zzb);
            } else {
                do {
                    if (z9) {
                        zzr = zzs();
                    } else {
                        zzr = zzr();
                    }
                    list.add(zzr);
                    if (this.zza.zzC()) {
                        return;
                    } else {
                        zzm = this.zza.zzm();
                    }
                } while (zzm == this.zzb);
                i10 = zzm;
            }
            this.zzd = i10;
            return;
        }
        throw zzje.zza();
    }

    @Override // com.google.android.recaptcha.internal.zzkq
    public final void zzL(List list) {
        int zzm;
        int i10;
        if (list instanceof zziu) {
            zziu zziuVar = (zziu) list;
            int i11 = this.zzb & 7;
            if (i11 != 0) {
                if (i11 == 2) {
                    zzhc zzhcVar = this.zza;
                    int zzd = zzhcVar.zzd() + zzhcVar.zzn();
                    do {
                        zziuVar.zzg(this.zza.zzn());
                    } while (this.zza.zzd() < zzd);
                    zzR(zzd);
                    return;
                }
                throw zzje.zza();
            }
            do {
                zziuVar.zzg(this.zza.zzn());
                if (!this.zza.zzC()) {
                    i10 = this.zza.zzm();
                } else {
                    return;
                }
            } while (i10 == this.zzb);
        } else {
            int i12 = this.zzb & 7;
            if (i12 != 0) {
                if (i12 == 2) {
                    zzhc zzhcVar2 = this.zza;
                    int zzd2 = zzhcVar2.zzd() + zzhcVar2.zzn();
                    do {
                        list.add(Integer.valueOf(this.zza.zzn()));
                    } while (this.zza.zzd() < zzd2);
                    zzR(zzd2);
                    return;
                }
                throw zzje.zza();
            }
            do {
                list.add(Integer.valueOf(this.zza.zzn()));
                if (!this.zza.zzC()) {
                    zzm = this.zza.zzm();
                } else {
                    return;
                }
            } while (zzm == this.zzb);
            i10 = zzm;
        }
        this.zzd = i10;
    }

    @Override // com.google.android.recaptcha.internal.zzkq
    public final void zzM(List list) {
        int zzm;
        int i10;
        if (list instanceof zzjt) {
            zzjt zzjtVar = (zzjt) list;
            int i11 = this.zzb & 7;
            if (i11 != 0) {
                if (i11 == 2) {
                    zzhc zzhcVar = this.zza;
                    int zzd = zzhcVar.zzd() + zzhcVar.zzn();
                    do {
                        zzjtVar.zzg(this.zza.zzv());
                    } while (this.zza.zzd() < zzd);
                    zzR(zzd);
                    return;
                }
                throw zzje.zza();
            }
            do {
                zzjtVar.zzg(this.zza.zzv());
                if (!this.zza.zzC()) {
                    i10 = this.zza.zzm();
                } else {
                    return;
                }
            } while (i10 == this.zzb);
        } else {
            int i12 = this.zzb & 7;
            if (i12 != 0) {
                if (i12 == 2) {
                    zzhc zzhcVar2 = this.zza;
                    int zzd2 = zzhcVar2.zzd() + zzhcVar2.zzn();
                    do {
                        list.add(Long.valueOf(this.zza.zzv()));
                    } while (this.zza.zzd() < zzd2);
                    zzR(zzd2);
                    return;
                }
                throw zzje.zza();
            }
            do {
                list.add(Long.valueOf(this.zza.zzv()));
                if (!this.zza.zzC()) {
                    zzm = this.zza.zzm();
                } else {
                    return;
                }
            } while (zzm == this.zzb);
            i10 = zzm;
        }
        this.zzd = i10;
    }

    @Override // com.google.android.recaptcha.internal.zzkq
    public final boolean zzN() {
        zzS(0);
        return this.zza.zzD();
    }

    @Override // com.google.android.recaptcha.internal.zzkq
    public final boolean zzO() {
        int i10;
        if (!this.zza.zzC() && (i10 = this.zzb) != this.zzc) {
            return this.zza.zzE(i10);
        }
        return false;
    }

    @Override // com.google.android.recaptcha.internal.zzkq
    public final double zza() {
        zzS(1);
        return this.zza.zzb();
    }

    @Override // com.google.android.recaptcha.internal.zzkq
    public final float zzb() {
        zzS(5);
        return this.zza.zzc();
    }

    @Override // com.google.android.recaptcha.internal.zzkq
    public final int zzc() {
        int i10 = this.zzd;
        if (i10 != 0) {
            this.zzb = i10;
            this.zzd = 0;
        } else {
            i10 = this.zza.zzm();
            this.zzb = i10;
        }
        if (i10 != 0 && i10 != this.zzc) {
            return i10 >>> 3;
        }
        return f.API_PRIORITY_OTHER;
    }

    @Override // com.google.android.recaptcha.internal.zzkq
    public final int zzd() {
        return this.zzb;
    }

    @Override // com.google.android.recaptcha.internal.zzkq
    public final int zze() {
        zzS(0);
        return this.zza.zzf();
    }

    @Override // com.google.android.recaptcha.internal.zzkq
    public final int zzf() {
        zzS(5);
        return this.zza.zzg();
    }

    @Override // com.google.android.recaptcha.internal.zzkq
    public final int zzg() {
        zzS(0);
        return this.zza.zzh();
    }

    @Override // com.google.android.recaptcha.internal.zzkq
    public final int zzh() {
        zzS(5);
        return this.zza.zzk();
    }

    @Override // com.google.android.recaptcha.internal.zzkq
    public final int zzi() {
        zzS(0);
        return this.zza.zzl();
    }

    @Override // com.google.android.recaptcha.internal.zzkq
    public final int zzj() {
        zzS(0);
        return this.zza.zzn();
    }

    @Override // com.google.android.recaptcha.internal.zzkq
    public final long zzk() {
        zzS(1);
        return this.zza.zzo();
    }

    @Override // com.google.android.recaptcha.internal.zzkq
    public final long zzl() {
        zzS(0);
        return this.zza.zzp();
    }

    @Override // com.google.android.recaptcha.internal.zzkq
    public final long zzm() {
        zzS(1);
        return this.zza.zzt();
    }

    @Override // com.google.android.recaptcha.internal.zzkq
    public final long zzn() {
        zzS(0);
        return this.zza.zzu();
    }

    @Override // com.google.android.recaptcha.internal.zzkq
    public final long zzo() {
        zzS(0);
        return this.zza.zzv();
    }

    @Override // com.google.android.recaptcha.internal.zzkq
    public final zzgw zzp() {
        zzS(2);
        return this.zza.zzw();
    }

    @Override // com.google.android.recaptcha.internal.zzkq
    public final String zzr() {
        zzS(2);
        return this.zza.zzx();
    }

    @Override // com.google.android.recaptcha.internal.zzkq
    public final String zzs() {
        zzS(2);
        return this.zza.zzy();
    }

    @Override // com.google.android.recaptcha.internal.zzkq
    public final void zzt(Object obj, zzkr zzkrVar, zzie zzieVar) {
        zzS(3);
        zzP(obj, zzkrVar, zzieVar);
    }

    @Override // com.google.android.recaptcha.internal.zzkq
    public final void zzu(Object obj, zzkr zzkrVar, zzie zzieVar) {
        zzS(2);
        zzQ(obj, zzkrVar, zzieVar);
    }

    @Override // com.google.android.recaptcha.internal.zzkq
    public final void zzv(List list) {
        int zzm;
        int i10;
        if (list instanceof zzgl) {
            zzgl zzglVar = (zzgl) list;
            int i11 = this.zzb & 7;
            if (i11 != 0) {
                if (i11 == 2) {
                    zzhc zzhcVar = this.zza;
                    int zzd = zzhcVar.zzd() + zzhcVar.zzn();
                    do {
                        zzglVar.zze(this.zza.zzD());
                    } while (this.zza.zzd() < zzd);
                    zzR(zzd);
                    return;
                }
                throw zzje.zza();
            }
            do {
                zzglVar.zze(this.zza.zzD());
                if (!this.zza.zzC()) {
                    i10 = this.zza.zzm();
                } else {
                    return;
                }
            } while (i10 == this.zzb);
        } else {
            int i12 = this.zzb & 7;
            if (i12 != 0) {
                if (i12 == 2) {
                    zzhc zzhcVar2 = this.zza;
                    int zzd2 = zzhcVar2.zzd() + zzhcVar2.zzn();
                    do {
                        list.add(Boolean.valueOf(this.zza.zzD()));
                    } while (this.zza.zzd() < zzd2);
                    zzR(zzd2);
                    return;
                }
                throw zzje.zza();
            }
            do {
                list.add(Boolean.valueOf(this.zza.zzD()));
                if (!this.zza.zzC()) {
                    zzm = this.zza.zzm();
                } else {
                    return;
                }
            } while (zzm == this.zzb);
            i10 = zzm;
        }
        this.zzd = i10;
    }

    @Override // com.google.android.recaptcha.internal.zzkq
    public final void zzw(List list) {
        int zzm;
        if ((this.zzb & 7) != 2) {
            throw zzje.zza();
        }
        do {
            list.add(zzp());
            if (this.zza.zzC()) {
                return;
            } else {
                zzm = this.zza.zzm();
            }
        } while (zzm == this.zzb);
        this.zzd = zzm;
    }

    @Override // com.google.android.recaptcha.internal.zzkq
    public final void zzx(List list) {
        int zzm;
        int i10;
        if (list instanceof zzhy) {
            zzhy zzhyVar = (zzhy) list;
            int i11 = this.zzb & 7;
            if (i11 != 1) {
                if (i11 == 2) {
                    int zzn = this.zza.zzn();
                    zzU(zzn);
                    int zzd = this.zza.zzd() + zzn;
                    do {
                        zzhyVar.zze(this.zza.zzb());
                    } while (this.zza.zzd() < zzd);
                    return;
                }
                throw zzje.zza();
            }
            do {
                zzhyVar.zze(this.zza.zzb());
                if (!this.zza.zzC()) {
                    i10 = this.zza.zzm();
                } else {
                    return;
                }
            } while (i10 == this.zzb);
        } else {
            int i12 = this.zzb & 7;
            if (i12 != 1) {
                if (i12 == 2) {
                    int zzn2 = this.zza.zzn();
                    zzU(zzn2);
                    int zzd2 = this.zza.zzd() + zzn2;
                    do {
                        list.add(Double.valueOf(this.zza.zzb()));
                    } while (this.zza.zzd() < zzd2);
                    return;
                }
                throw zzje.zza();
            }
            do {
                list.add(Double.valueOf(this.zza.zzb()));
                if (!this.zza.zzC()) {
                    zzm = this.zza.zzm();
                } else {
                    return;
                }
            } while (zzm == this.zzb);
            i10 = zzm;
        }
        this.zzd = i10;
    }

    @Override // com.google.android.recaptcha.internal.zzkq
    public final void zzy(List list) {
        int zzm;
        int i10;
        if (list instanceof zziu) {
            zziu zziuVar = (zziu) list;
            int i11 = this.zzb & 7;
            if (i11 != 0) {
                if (i11 == 2) {
                    zzhc zzhcVar = this.zza;
                    int zzd = zzhcVar.zzd() + zzhcVar.zzn();
                    do {
                        zziuVar.zzg(this.zza.zzf());
                    } while (this.zza.zzd() < zzd);
                    zzR(zzd);
                    return;
                }
                throw zzje.zza();
            }
            do {
                zziuVar.zzg(this.zza.zzf());
                if (!this.zza.zzC()) {
                    i10 = this.zza.zzm();
                } else {
                    return;
                }
            } while (i10 == this.zzb);
        } else {
            int i12 = this.zzb & 7;
            if (i12 != 0) {
                if (i12 == 2) {
                    zzhc zzhcVar2 = this.zza;
                    int zzd2 = zzhcVar2.zzd() + zzhcVar2.zzn();
                    do {
                        list.add(Integer.valueOf(this.zza.zzf()));
                    } while (this.zza.zzd() < zzd2);
                    zzR(zzd2);
                    return;
                }
                throw zzje.zza();
            }
            do {
                list.add(Integer.valueOf(this.zza.zzf()));
                if (!this.zza.zzC()) {
                    zzm = this.zza.zzm();
                } else {
                    return;
                }
            } while (zzm == this.zzb);
            i10 = zzm;
        }
        this.zzd = i10;
    }

    @Override // com.google.android.recaptcha.internal.zzkq
    public final void zzz(List list) {
        int zzm;
        int i10;
        if (list instanceof zziu) {
            zziu zziuVar = (zziu) list;
            int i11 = this.zzb & 7;
            if (i11 != 2) {
                if (i11 != 5) {
                    throw zzje.zza();
                }
                do {
                    zziuVar.zzg(this.zza.zzg());
                    if (!this.zza.zzC()) {
                        i10 = this.zza.zzm();
                    } else {
                        return;
                    }
                } while (i10 == this.zzb);
            } else {
                int zzn = this.zza.zzn();
                zzT(zzn);
                int zzd = this.zza.zzd() + zzn;
                do {
                    zziuVar.zzg(this.zza.zzg());
                } while (this.zza.zzd() < zzd);
                return;
            }
        } else {
            int i12 = this.zzb & 7;
            if (i12 != 2) {
                if (i12 != 5) {
                    throw zzje.zza();
                }
                do {
                    list.add(Integer.valueOf(this.zza.zzg()));
                    if (!this.zza.zzC()) {
                        zzm = this.zza.zzm();
                    } else {
                        return;
                    }
                } while (zzm == this.zzb);
                i10 = zzm;
            } else {
                int zzn2 = this.zza.zzn();
                zzT(zzn2);
                int zzd2 = this.zza.zzd() + zzn2;
                do {
                    list.add(Integer.valueOf(this.zza.zzg()));
                } while (this.zza.zzd() < zzd2);
                return;
            }
        }
        this.zzd = i10;
    }
}
