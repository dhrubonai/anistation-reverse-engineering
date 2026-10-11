package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.api.f;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import com.google.android.gms.internal.p002firebaseauthapi.zzaja;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzaig implements zzald {
    private final zzaib zza;
    private int zzb;
    private int zzc;
    private int zzd = 0;

    private zzaig(zzaib zzaibVar) {
        zzaib zzaibVar2 = (zzaib) zzajc.zza(zzaibVar, "input");
        this.zza = zzaibVar2;
        zzaibVar2.zzd = this;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzald
    public final double zza() {
        zzb(1);
        return this.zza.zza();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzald
    public final float zzb() {
        zzb(5);
        return this.zza.zzb();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzald
    public final int zzc() {
        int i10 = this.zzd;
        if (i10 != 0) {
            this.zzb = i10;
            this.zzd = 0;
        } else {
            this.zzb = this.zza.zzi();
        }
        int i11 = this.zzb;
        return (i11 == 0 || i11 == this.zzc) ? f.API_PRIORITY_OTHER : i11 >>> 3;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzald
    public final int zzd() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzald
    public final int zze() {
        zzb(0);
        return this.zza.zzd();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzald
    public final int zzf() {
        zzb(5);
        return this.zza.zze();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzald
    public final int zzg() {
        zzb(0);
        return this.zza.zzf();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzald
    public final int zzh() {
        zzb(5);
        return this.zza.zzg();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzald
    public final int zzi() {
        zzb(0);
        return this.zza.zzh();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzald
    public final int zzj() {
        zzb(0);
        return this.zza.zzj();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzald
    public final long zzk() {
        zzb(1);
        return this.zza.zzk();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzald
    public final long zzl() {
        zzb(0);
        return this.zza.zzl();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzald
    public final long zzm() {
        zzb(1);
        return this.zza.zzn();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzald
    public final long zzn() {
        zzb(0);
        return this.zza.zzo();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzald
    public final long zzo() {
        zzb(0);
        return this.zza.zzp();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzald
    public final zzahm zzp() {
        zzb(2);
        return this.zza.zzq();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzald
    public final String zzq() {
        zzb(2);
        return this.zza.zzr();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzald
    public final String zzr() {
        zzb(2);
        return this.zza.zzs();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzald
    public final boolean zzs() {
        zzb(0);
        return this.zza.zzu();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzald
    public final boolean zzt() {
        int i10;
        if (!this.zza.zzt() && (i10 = this.zzb) != this.zzc) {
            return this.zza.zzd(i10);
        }
        return false;
    }

    private final <T> void zzd(T t9, zzalc<T> zzalcVar, zzaip zzaipVar) {
        int zzj = this.zza.zzj();
        zzaib zzaibVar = this.zza;
        if (zzaibVar.zza < zzaibVar.zzb) {
            int zza = zzaibVar.zza(zzj);
            this.zza.zza++;
            zzalcVar.zza(t9, this, zzaipVar);
            this.zza.zzb(0);
            r5.zza--;
            this.zza.zzc(zza);
            return;
        }
        throw new zzajj("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    public static zzaig zza(zzaib zzaibVar) {
        zzaig zzaigVar = zzaibVar.zzd;
        return zzaigVar != null ? zzaigVar : new zzaig(zzaibVar);
    }

    private final <T> T zzb(zzalc<T> zzalcVar, zzaip zzaipVar) {
        T zza = zzalcVar.zza();
        zzd(zza, zzalcVar, zzaipVar);
        zzalcVar.zzc(zza);
        return zza;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzald
    public final void zze(List<Integer> list) {
        int zzi;
        int zzi2;
        if (list instanceof zzajd) {
            zzajd zzajdVar = (zzajd) list;
            int i10 = this.zzb & 7;
            if (i10 != 2) {
                if (i10 != 5) {
                    throw zzajj.zza();
                }
                do {
                    zzajdVar.zzc(this.zza.zze());
                    if (this.zza.zzt()) {
                        return;
                    } else {
                        zzi2 = this.zza.zzi();
                    }
                } while (zzi2 == this.zzb);
                this.zzd = zzi2;
                return;
            }
            int zzj = this.zza.zzj();
            zzc(zzj);
            int zzc = this.zza.zzc() + zzj;
            do {
                zzajdVar.zzc(this.zza.zze());
            } while (this.zza.zzc() < zzc);
            return;
        }
        int i11 = this.zzb & 7;
        if (i11 != 2) {
            if (i11 != 5) {
                throw zzajj.zza();
            }
            do {
                list.add(Integer.valueOf(this.zza.zze()));
                if (this.zza.zzt()) {
                    return;
                } else {
                    zzi = this.zza.zzi();
                }
            } while (zzi == this.zzb);
            this.zzd = zzi;
            return;
        }
        int zzj2 = this.zza.zzj();
        zzc(zzj2);
        int zzc2 = this.zza.zzc() + zzj2;
        do {
            list.add(Integer.valueOf(this.zza.zze()));
        } while (this.zza.zzc() < zzc2);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzald
    public final void zzf(List<Long> list) {
        int zzi;
        int zzi2;
        if (list instanceof zzajz) {
            zzajz zzajzVar = (zzajz) list;
            int i10 = this.zzb & 7;
            if (i10 != 1) {
                if (i10 == 2) {
                    int zzj = this.zza.zzj();
                    zzd(zzj);
                    int zzc = this.zza.zzc() + zzj;
                    do {
                        zzajzVar.zza(this.zza.zzk());
                    } while (this.zza.zzc() < zzc);
                    return;
                }
                throw zzajj.zza();
            }
            do {
                zzajzVar.zza(this.zza.zzk());
                if (this.zza.zzt()) {
                    return;
                } else {
                    zzi2 = this.zza.zzi();
                }
            } while (zzi2 == this.zzb);
            this.zzd = zzi2;
            return;
        }
        int i11 = this.zzb & 7;
        if (i11 != 1) {
            if (i11 == 2) {
                int zzj2 = this.zza.zzj();
                zzd(zzj2);
                int zzc2 = this.zza.zzc() + zzj2;
                do {
                    list.add(Long.valueOf(this.zza.zzk()));
                } while (this.zza.zzc() < zzc2);
                return;
            }
            throw zzajj.zza();
        }
        do {
            list.add(Long.valueOf(this.zza.zzk()));
            if (this.zza.zzt()) {
                return;
            } else {
                zzi = this.zza.zzi();
            }
        } while (zzi == this.zzb);
        this.zzd = zzi;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzald
    public final void zzg(List<Float> list) {
        int zzi;
        int zzi2;
        if (list instanceof zzaiy) {
            zzaiy zzaiyVar = (zzaiy) list;
            int i10 = this.zzb & 7;
            if (i10 != 2) {
                if (i10 != 5) {
                    throw zzajj.zza();
                }
                do {
                    zzaiyVar.zza(this.zza.zzb());
                    if (this.zza.zzt()) {
                        return;
                    } else {
                        zzi2 = this.zza.zzi();
                    }
                } while (zzi2 == this.zzb);
                this.zzd = zzi2;
                return;
            }
            int zzj = this.zza.zzj();
            zzc(zzj);
            int zzc = this.zza.zzc() + zzj;
            do {
                zzaiyVar.zza(this.zza.zzb());
            } while (this.zza.zzc() < zzc);
            return;
        }
        int i11 = this.zzb & 7;
        if (i11 != 2) {
            if (i11 != 5) {
                throw zzajj.zza();
            }
            do {
                list.add(Float.valueOf(this.zza.zzb()));
                if (this.zza.zzt()) {
                    return;
                } else {
                    zzi = this.zza.zzi();
                }
            } while (zzi == this.zzb);
            this.zzd = zzi;
            return;
        }
        int zzj2 = this.zza.zzj();
        zzc(zzj2);
        int zzc2 = this.zza.zzc() + zzj2;
        do {
            list.add(Float.valueOf(this.zza.zzb()));
        } while (this.zza.zzc() < zzc2);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzald
    public final void zzh(List<Integer> list) {
        int zzi;
        int zzi2;
        if (list instanceof zzajd) {
            zzajd zzajdVar = (zzajd) list;
            int i10 = this.zzb & 7;
            if (i10 != 0) {
                if (i10 == 2) {
                    int zzc = this.zza.zzc() + this.zza.zzj();
                    do {
                        zzajdVar.zzc(this.zza.zzf());
                    } while (this.zza.zzc() < zzc);
                    zza(zzc);
                    return;
                }
                throw zzajj.zza();
            }
            do {
                zzajdVar.zzc(this.zza.zzf());
                if (this.zza.zzt()) {
                    return;
                } else {
                    zzi2 = this.zza.zzi();
                }
            } while (zzi2 == this.zzb);
            this.zzd = zzi2;
            return;
        }
        int i11 = this.zzb & 7;
        if (i11 != 0) {
            if (i11 == 2) {
                int zzc2 = this.zza.zzc() + this.zza.zzj();
                do {
                    list.add(Integer.valueOf(this.zza.zzf()));
                } while (this.zza.zzc() < zzc2);
                zza(zzc2);
                return;
            }
            throw zzajj.zza();
        }
        do {
            list.add(Integer.valueOf(this.zza.zzf()));
            if (this.zza.zzt()) {
                return;
            } else {
                zzi = this.zza.zzi();
            }
        } while (zzi == this.zzb);
        this.zzd = zzi;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzald
    public final void zzi(List<Long> list) {
        int zzi;
        int zzi2;
        if (list instanceof zzajz) {
            zzajz zzajzVar = (zzajz) list;
            int i10 = this.zzb & 7;
            if (i10 != 0) {
                if (i10 == 2) {
                    int zzc = this.zza.zzc() + this.zza.zzj();
                    do {
                        zzajzVar.zza(this.zza.zzl());
                    } while (this.zza.zzc() < zzc);
                    zza(zzc);
                    return;
                }
                throw zzajj.zza();
            }
            do {
                zzajzVar.zza(this.zza.zzl());
                if (this.zza.zzt()) {
                    return;
                } else {
                    zzi2 = this.zza.zzi();
                }
            } while (zzi2 == this.zzb);
            this.zzd = zzi2;
            return;
        }
        int i11 = this.zzb & 7;
        if (i11 != 0) {
            if (i11 == 2) {
                int zzc2 = this.zza.zzc() + this.zza.zzj();
                do {
                    list.add(Long.valueOf(this.zza.zzl()));
                } while (this.zza.zzc() < zzc2);
                zza(zzc2);
                return;
            }
            throw zzajj.zza();
        }
        do {
            list.add(Long.valueOf(this.zza.zzl()));
            if (this.zza.zzt()) {
                return;
            } else {
                zzi = this.zza.zzi();
            }
        } while (zzi == this.zzb);
        this.zzd = zzi;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzald
    public final void zzj(List<Integer> list) {
        int zzi;
        int zzi2;
        if (list instanceof zzajd) {
            zzajd zzajdVar = (zzajd) list;
            int i10 = this.zzb & 7;
            if (i10 != 2) {
                if (i10 != 5) {
                    throw zzajj.zza();
                }
                do {
                    zzajdVar.zzc(this.zza.zzg());
                    if (this.zza.zzt()) {
                        return;
                    } else {
                        zzi2 = this.zza.zzi();
                    }
                } while (zzi2 == this.zzb);
                this.zzd = zzi2;
                return;
            }
            int zzj = this.zza.zzj();
            zzc(zzj);
            int zzc = this.zza.zzc() + zzj;
            do {
                zzajdVar.zzc(this.zza.zzg());
            } while (this.zza.zzc() < zzc);
            return;
        }
        int i11 = this.zzb & 7;
        if (i11 != 2) {
            if (i11 != 5) {
                throw zzajj.zza();
            }
            do {
                list.add(Integer.valueOf(this.zza.zzg()));
                if (this.zza.zzt()) {
                    return;
                } else {
                    zzi = this.zza.zzi();
                }
            } while (zzi == this.zzb);
            this.zzd = zzi;
            return;
        }
        int zzj2 = this.zza.zzj();
        zzc(zzj2);
        int zzc2 = this.zza.zzc() + zzj2;
        do {
            list.add(Integer.valueOf(this.zza.zzg()));
        } while (this.zza.zzc() < zzc2);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzald
    public final void zzk(List<Long> list) {
        int zzi;
        int zzi2;
        if (list instanceof zzajz) {
            zzajz zzajzVar = (zzajz) list;
            int i10 = this.zzb & 7;
            if (i10 != 1) {
                if (i10 == 2) {
                    int zzj = this.zza.zzj();
                    zzd(zzj);
                    int zzc = this.zza.zzc() + zzj;
                    do {
                        zzajzVar.zza(this.zza.zzn());
                    } while (this.zza.zzc() < zzc);
                    return;
                }
                throw zzajj.zza();
            }
            do {
                zzajzVar.zza(this.zza.zzn());
                if (this.zza.zzt()) {
                    return;
                } else {
                    zzi2 = this.zza.zzi();
                }
            } while (zzi2 == this.zzb);
            this.zzd = zzi2;
            return;
        }
        int i11 = this.zzb & 7;
        if (i11 != 1) {
            if (i11 == 2) {
                int zzj2 = this.zza.zzj();
                zzd(zzj2);
                int zzc2 = this.zza.zzc() + zzj2;
                do {
                    list.add(Long.valueOf(this.zza.zzn()));
                } while (this.zza.zzc() < zzc2);
                return;
            }
            throw zzajj.zza();
        }
        do {
            list.add(Long.valueOf(this.zza.zzn()));
            if (this.zza.zzt()) {
                return;
            } else {
                zzi = this.zza.zzi();
            }
        } while (zzi == this.zzb);
        this.zzd = zzi;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzald
    public final void zzl(List<Integer> list) {
        int zzi;
        int zzi2;
        if (list instanceof zzajd) {
            zzajd zzajdVar = (zzajd) list;
            int i10 = this.zzb & 7;
            if (i10 != 0) {
                if (i10 == 2) {
                    int zzc = this.zza.zzc() + this.zza.zzj();
                    do {
                        zzajdVar.zzc(this.zza.zzh());
                    } while (this.zza.zzc() < zzc);
                    zza(zzc);
                    return;
                }
                throw zzajj.zza();
            }
            do {
                zzajdVar.zzc(this.zza.zzh());
                if (this.zza.zzt()) {
                    return;
                } else {
                    zzi2 = this.zza.zzi();
                }
            } while (zzi2 == this.zzb);
            this.zzd = zzi2;
            return;
        }
        int i11 = this.zzb & 7;
        if (i11 != 0) {
            if (i11 == 2) {
                int zzc2 = this.zza.zzc() + this.zza.zzj();
                do {
                    list.add(Integer.valueOf(this.zza.zzh()));
                } while (this.zza.zzc() < zzc2);
                zza(zzc2);
                return;
            }
            throw zzajj.zza();
        }
        do {
            list.add(Integer.valueOf(this.zza.zzh()));
            if (this.zza.zzt()) {
                return;
            } else {
                zzi = this.zza.zzi();
            }
        } while (zzi == this.zzb);
        this.zzd = zzi;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzald
    public final void zzm(List<Long> list) {
        int zzi;
        int zzi2;
        if (list instanceof zzajz) {
            zzajz zzajzVar = (zzajz) list;
            int i10 = this.zzb & 7;
            if (i10 != 0) {
                if (i10 == 2) {
                    int zzc = this.zza.zzc() + this.zza.zzj();
                    do {
                        zzajzVar.zza(this.zza.zzo());
                    } while (this.zza.zzc() < zzc);
                    zza(zzc);
                    return;
                }
                throw zzajj.zza();
            }
            do {
                zzajzVar.zza(this.zza.zzo());
                if (this.zza.zzt()) {
                    return;
                } else {
                    zzi2 = this.zza.zzi();
                }
            } while (zzi2 == this.zzb);
            this.zzd = zzi2;
            return;
        }
        int i11 = this.zzb & 7;
        if (i11 != 0) {
            if (i11 == 2) {
                int zzc2 = this.zza.zzc() + this.zza.zzj();
                do {
                    list.add(Long.valueOf(this.zza.zzo()));
                } while (this.zza.zzc() < zzc2);
                zza(zzc2);
                return;
            }
            throw zzajj.zza();
        }
        do {
            list.add(Long.valueOf(this.zza.zzo()));
            if (this.zza.zzt()) {
                return;
            } else {
                zzi = this.zza.zzi();
            }
        } while (zzi == this.zzb);
        this.zzd = zzi;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzald
    public final void zzn(List<String> list) {
        zza(list, false);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzald
    public final void zzo(List<String> list) {
        zza(list, true);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzald
    public final void zzp(List<Integer> list) {
        int zzi;
        int zzi2;
        if (list instanceof zzajd) {
            zzajd zzajdVar = (zzajd) list;
            int i10 = this.zzb & 7;
            if (i10 != 0) {
                if (i10 == 2) {
                    int zzc = this.zza.zzc() + this.zza.zzj();
                    do {
                        zzajdVar.zzc(this.zza.zzj());
                    } while (this.zza.zzc() < zzc);
                    zza(zzc);
                    return;
                }
                throw zzajj.zza();
            }
            do {
                zzajdVar.zzc(this.zza.zzj());
                if (this.zza.zzt()) {
                    return;
                } else {
                    zzi2 = this.zza.zzi();
                }
            } while (zzi2 == this.zzb);
            this.zzd = zzi2;
            return;
        }
        int i11 = this.zzb & 7;
        if (i11 != 0) {
            if (i11 == 2) {
                int zzc2 = this.zza.zzc() + this.zza.zzj();
                do {
                    list.add(Integer.valueOf(this.zza.zzj()));
                } while (this.zza.zzc() < zzc2);
                zza(zzc2);
                return;
            }
            throw zzajj.zza();
        }
        do {
            list.add(Integer.valueOf(this.zza.zzj()));
            if (this.zza.zzt()) {
                return;
            } else {
                zzi = this.zza.zzi();
            }
        } while (zzi == this.zzb);
        this.zzd = zzi;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzald
    public final void zzq(List<Long> list) {
        int zzi;
        int zzi2;
        if (list instanceof zzajz) {
            zzajz zzajzVar = (zzajz) list;
            int i10 = this.zzb & 7;
            if (i10 != 0) {
                if (i10 == 2) {
                    int zzc = this.zza.zzc() + this.zza.zzj();
                    do {
                        zzajzVar.zza(this.zza.zzp());
                    } while (this.zza.zzc() < zzc);
                    zza(zzc);
                    return;
                }
                throw zzajj.zza();
            }
            do {
                zzajzVar.zza(this.zza.zzp());
                if (this.zza.zzt()) {
                    return;
                } else {
                    zzi2 = this.zza.zzi();
                }
            } while (zzi2 == this.zzb);
            this.zzd = zzi2;
            return;
        }
        int i11 = this.zzb & 7;
        if (i11 != 0) {
            if (i11 == 2) {
                int zzc2 = this.zza.zzc() + this.zza.zzj();
                do {
                    list.add(Long.valueOf(this.zza.zzp()));
                } while (this.zza.zzc() < zzc2);
                zza(zzc2);
                return;
            }
            throw zzajj.zza();
        }
        do {
            list.add(Long.valueOf(this.zza.zzp()));
            if (this.zza.zzt()) {
                return;
            } else {
                zzi = this.zza.zzi();
            }
        } while (zzi == this.zzb);
        this.zzd = zzi;
    }

    private final Object zza(zzamo zzamoVar, Class<?> cls, zzaip zzaipVar) {
        switch (zzaij.zza[zzamoVar.ordinal()]) {
            case 1:
                return Boolean.valueOf(zzs());
            case 2:
                return zzp();
            case 3:
                return Double.valueOf(zza());
            case 4:
                return Integer.valueOf(zze());
            case 5:
                return Integer.valueOf(zzf());
            case 6:
                return Long.valueOf(zzk());
            case zzaja.zze.zzg /* 7 */:
                return Float.valueOf(zzb());
            case 8:
                return Integer.valueOf(zzg());
            case 9:
                return Long.valueOf(zzl());
            case 10:
                zzb(2);
                return zzb(zzaky.zza().zza((Class) cls), zzaipVar);
            case ModuleDescriptor.MODULE_VERSION /* 11 */:
                return Integer.valueOf(zzh());
            case 12:
                return Long.valueOf(zzm());
            case 13:
                return Integer.valueOf(zzi());
            case 14:
                return Long.valueOf(zzn());
            case 15:
                return zzr();
            case 16:
                return Integer.valueOf(zzj());
            case 17:
                return Long.valueOf(zzo());
            default:
                throw new IllegalArgumentException("unsupported field type.");
        }
    }

    private final <T> void zzc(T t9, zzalc<T> zzalcVar, zzaip zzaipVar) {
        int i10 = this.zzc;
        this.zzc = ((this.zzb >>> 3) << 3) | 4;
        try {
            zzalcVar.zza(t9, this, zzaipVar);
            if (this.zzb == this.zzc) {
            } else {
                throw zzajj.zzg();
            }
        } finally {
            this.zzc = i10;
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzald
    public final <T> void zzb(T t9, zzalc<T> zzalcVar, zzaip zzaipVar) {
        zzb(2);
        zzd(t9, zzalcVar, zzaipVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzald
    public final void zzb(List<zzahm> list) {
        int zzi;
        if ((this.zzb & 7) != 2) {
            throw zzajj.zza();
        }
        do {
            list.add(zzp());
            if (this.zza.zzt()) {
                return;
            } else {
                zzi = this.zza.zzi();
            }
        } while (zzi == this.zzb);
        this.zzd = zzi;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzald
    public final void zzd(List<Integer> list) {
        int zzi;
        int zzi2;
        if (list instanceof zzajd) {
            zzajd zzajdVar = (zzajd) list;
            int i10 = this.zzb & 7;
            if (i10 != 0) {
                if (i10 == 2) {
                    int zzc = this.zza.zzc() + this.zza.zzj();
                    do {
                        zzajdVar.zzc(this.zza.zzd());
                    } while (this.zza.zzc() < zzc);
                    zza(zzc);
                    return;
                }
                throw zzajj.zza();
            }
            do {
                zzajdVar.zzc(this.zza.zzd());
                if (this.zza.zzt()) {
                    return;
                } else {
                    zzi2 = this.zza.zzi();
                }
            } while (zzi2 == this.zzb);
            this.zzd = zzi2;
            return;
        }
        int i11 = this.zzb & 7;
        if (i11 != 0) {
            if (i11 == 2) {
                int zzc2 = this.zza.zzc() + this.zza.zzj();
                do {
                    list.add(Integer.valueOf(this.zza.zzd()));
                } while (this.zza.zzc() < zzc2);
                zza(zzc2);
                return;
            }
            throw zzajj.zza();
        }
        do {
            list.add(Integer.valueOf(this.zza.zzd()));
            if (this.zza.zzt()) {
                return;
            } else {
                zzi = this.zza.zzi();
            }
        } while (zzi == this.zzb);
        this.zzd = zzi;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzald
    public final <T> void zzb(List<T> list, zzalc<T> zzalcVar, zzaip zzaipVar) {
        int zzi;
        int i10 = this.zzb;
        if ((i10 & 7) != 2) {
            throw zzajj.zza();
        }
        do {
            list.add(zzb(zzalcVar, zzaipVar));
            if (this.zza.zzt() || this.zzd != 0) {
                return;
            } else {
                zzi = this.zza.zzi();
            }
        } while (zzi == i10);
        this.zzd = zzi;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzald
    public final void zzc(List<Double> list) {
        int zzi;
        int zzi2;
        if (list instanceof zzain) {
            zzain zzainVar = (zzain) list;
            int i10 = this.zzb & 7;
            if (i10 != 1) {
                if (i10 == 2) {
                    int zzj = this.zza.zzj();
                    zzd(zzj);
                    int zzc = this.zza.zzc() + zzj;
                    do {
                        zzainVar.zza(this.zza.zza());
                    } while (this.zza.zzc() < zzc);
                    return;
                }
                throw zzajj.zza();
            }
            do {
                zzainVar.zza(this.zza.zza());
                if (this.zza.zzt()) {
                    return;
                } else {
                    zzi2 = this.zza.zzi();
                }
            } while (zzi2 == this.zzb);
            this.zzd = zzi2;
            return;
        }
        int i11 = this.zzb & 7;
        if (i11 != 1) {
            if (i11 == 2) {
                int zzj2 = this.zza.zzj();
                zzd(zzj2);
                int zzc2 = this.zza.zzc() + zzj2;
                do {
                    list.add(Double.valueOf(this.zza.zza()));
                } while (this.zza.zzc() < zzc2);
                return;
            }
            throw zzajj.zza();
        }
        do {
            list.add(Double.valueOf(this.zza.zza()));
            if (this.zza.zzt()) {
                return;
            } else {
                zzi = this.zza.zzi();
            }
        } while (zzi == this.zzb);
        this.zzd = zzi;
    }

    private final void zzb(int i10) {
        if ((this.zzb & 7) != i10) {
            throw zzajj.zza();
        }
    }

    private final <T> T zza(zzalc<T> zzalcVar, zzaip zzaipVar) {
        T zza = zzalcVar.zza();
        zzc(zza, zzalcVar, zzaipVar);
        zzalcVar.zzc(zza);
        return zza;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzald
    public final <T> void zza(T t9, zzalc<T> zzalcVar, zzaip zzaipVar) {
        zzb(3);
        zzc(t9, zzalcVar, zzaipVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzald
    public final void zza(List<Boolean> list) {
        int zzi;
        int zzi2;
        if (list instanceof zzahk) {
            zzahk zzahkVar = (zzahk) list;
            int i10 = this.zzb & 7;
            if (i10 != 0) {
                if (i10 == 2) {
                    int zzc = this.zza.zzc() + this.zza.zzj();
                    do {
                        zzahkVar.zza(this.zza.zzu());
                    } while (this.zza.zzc() < zzc);
                    zza(zzc);
                    return;
                }
                throw zzajj.zza();
            }
            do {
                zzahkVar.zza(this.zza.zzu());
                if (this.zza.zzt()) {
                    return;
                } else {
                    zzi2 = this.zza.zzi();
                }
            } while (zzi2 == this.zzb);
            this.zzd = zzi2;
            return;
        }
        int i11 = this.zzb & 7;
        if (i11 != 0) {
            if (i11 == 2) {
                int zzc2 = this.zza.zzc() + this.zza.zzj();
                do {
                    list.add(Boolean.valueOf(this.zza.zzu()));
                } while (this.zza.zzc() < zzc2);
                zza(zzc2);
                return;
            }
            throw zzajj.zza();
        }
        do {
            list.add(Boolean.valueOf(this.zza.zzu()));
            if (this.zza.zzt()) {
                return;
            } else {
                zzi = this.zza.zzi();
            }
        } while (zzi == this.zzb);
        this.zzd = zzi;
    }

    private static void zzd(int i10) {
        if ((i10 & 7) != 0) {
            throw zzajj.zzg();
        }
    }

    private static void zzc(int i10) {
        if ((i10 & 3) != 0) {
            throw zzajj.zzg();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzald
    @Deprecated
    public final <T> void zza(List<T> list, zzalc<T> zzalcVar, zzaip zzaipVar) {
        int zzi;
        int i10 = this.zzb;
        if ((i10 & 7) != 3) {
            throw zzajj.zza();
        }
        do {
            list.add(zza(zzalcVar, zzaipVar));
            if (this.zza.zzt() || this.zzd != 0) {
                return;
            } else {
                zzi = this.zza.zzi();
            }
        } while (zzi == i10);
        this.zzd = zzi;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x005b, code lost:
    
        r8.put(r2, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0063, code lost:
    
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzald
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final <K, V> void zza(java.util.Map<K, V> r8, com.google.android.gms.internal.p002firebaseauthapi.zzakf<K, V> r9, com.google.android.gms.internal.p002firebaseauthapi.zzaip r10) {
        /*
            r7 = this;
            r0 = 2
            r7.zzb(r0)
            com.google.android.gms.internal.firebase-auth-api.zzaib r1 = r7.zza
            int r1 = r1.zzj()
            com.google.android.gms.internal.firebase-auth-api.zzaib r2 = r7.zza
            int r1 = r2.zza(r1)
            K r2 = r9.zzb
            V r3 = r9.zzd
        L14:
            int r4 = r7.zzc()     // Catch: java.lang.Throwable -> L64
            r5 = 2147483647(0x7fffffff, float:NaN)
            if (r4 == r5) goto L5b
            com.google.android.gms.internal.firebase-auth-api.zzaib r5 = r7.zza     // Catch: java.lang.Throwable -> L64
            boolean r5 = r5.zzt()     // Catch: java.lang.Throwable -> L64
            if (r5 != 0) goto L5b
            r5 = 1
            java.lang.String r6 = "Unable to parse map entry."
            if (r4 == r5) goto L46
            if (r4 == r0) goto L39
            boolean r4 = r7.zzt()     // Catch: com.google.android.gms.internal.p002firebaseauthapi.zzaji -> L4e java.lang.Throwable -> L64
            if (r4 == 0) goto L33
            goto L14
        L33:
            com.google.android.gms.internal.firebase-auth-api.zzajj r4 = new com.google.android.gms.internal.firebase-auth-api.zzajj     // Catch: com.google.android.gms.internal.p002firebaseauthapi.zzaji -> L4e java.lang.Throwable -> L64
            r4.<init>(r6)     // Catch: com.google.android.gms.internal.p002firebaseauthapi.zzaji -> L4e java.lang.Throwable -> L64
            throw r4     // Catch: com.google.android.gms.internal.p002firebaseauthapi.zzaji -> L4e java.lang.Throwable -> L64
        L39:
            com.google.android.gms.internal.firebase-auth-api.zzamo r4 = r9.zzc     // Catch: com.google.android.gms.internal.p002firebaseauthapi.zzaji -> L4e java.lang.Throwable -> L64
            V r5 = r9.zzd     // Catch: com.google.android.gms.internal.p002firebaseauthapi.zzaji -> L4e java.lang.Throwable -> L64
            java.lang.Class r5 = r5.getClass()     // Catch: com.google.android.gms.internal.p002firebaseauthapi.zzaji -> L4e java.lang.Throwable -> L64
            java.lang.Object r3 = r7.zza(r4, r5, r10)     // Catch: com.google.android.gms.internal.p002firebaseauthapi.zzaji -> L4e java.lang.Throwable -> L64
            goto L14
        L46:
            com.google.android.gms.internal.firebase-auth-api.zzamo r4 = r9.zza     // Catch: com.google.android.gms.internal.p002firebaseauthapi.zzaji -> L4e java.lang.Throwable -> L64
            r5 = 0
            java.lang.Object r2 = r7.zza(r4, r5, r5)     // Catch: com.google.android.gms.internal.p002firebaseauthapi.zzaji -> L4e java.lang.Throwable -> L64
            goto L14
        L4e:
            boolean r4 = r7.zzt()     // Catch: java.lang.Throwable -> L64
            if (r4 == 0) goto L55
            goto L14
        L55:
            com.google.android.gms.internal.firebase-auth-api.zzajj r8 = new com.google.android.gms.internal.firebase-auth-api.zzajj     // Catch: java.lang.Throwable -> L64
            r8.<init>(r6)     // Catch: java.lang.Throwable -> L64
            throw r8     // Catch: java.lang.Throwable -> L64
        L5b:
            r8.put(r2, r3)     // Catch: java.lang.Throwable -> L64
            com.google.android.gms.internal.firebase-auth-api.zzaib r8 = r7.zza
            r8.zzc(r1)
            return
        L64:
            r8 = move-exception
            com.google.android.gms.internal.firebase-auth-api.zzaib r9 = r7.zza
            r9.zzc(r1)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p002firebaseauthapi.zzaig.zza(java.util.Map, com.google.android.gms.internal.firebase-auth-api.zzakf, com.google.android.gms.internal.firebase-auth-api.zzaip):void");
    }

    private final void zza(List<String> list, boolean z9) {
        int zzi;
        int zzi2;
        if ((this.zzb & 7) == 2) {
            if ((list instanceof zzajq) && !z9) {
                zzajq zzajqVar = (zzajq) list;
                do {
                    zzajqVar.zza(zzp());
                    if (this.zza.zzt()) {
                        return;
                    } else {
                        zzi2 = this.zza.zzi();
                    }
                } while (zzi2 == this.zzb);
                this.zzd = zzi2;
                return;
            }
            do {
                list.add(z9 ? zzr() : zzq());
                if (this.zza.zzt()) {
                    return;
                } else {
                    zzi = this.zza.zzi();
                }
            } while (zzi == this.zzb);
            this.zzd = zzi;
            return;
        }
        throw zzajj.zza();
    }

    private final void zza(int i10) {
        if (this.zza.zzc() != i10) {
            throw zzajj.zzi();
        }
    }
}
