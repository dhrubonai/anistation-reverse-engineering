package com.google.android.gms.internal.p002firebaseauthapi;

import a3.g;
import com.google.android.gms.common.api.f;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzaic extends zzaib {
    private final InputStream zze;
    private final byte[] zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private zzaif zzm;

    private final void zzaa() {
        int i10 = this.zzg + this.zzh;
        this.zzg = i10;
        int i11 = this.zzk + i10;
        int i12 = this.zzl;
        if (i11 > i12) {
            int i13 = i11 - i12;
            this.zzh = i13;
            this.zzg = i10 - i13;
            return;
        }
        this.zzh = 0;
    }

    private final byte zzv() {
        if (this.zzi == this.zzg) {
            zzg(1);
        }
        byte[] bArr = this.zzf;
        int i10 = this.zzi;
        this.zzi = i10 + 1;
        return bArr[i10];
    }

    private final int zzw() {
        int i10 = this.zzi;
        if (this.zzg - i10 < 4) {
            zzg(4);
            i10 = this.zzi;
        }
        byte[] bArr = this.zzf;
        this.zzi = i10 + 4;
        return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0066, code lost:
    
        if (r2[r3] >= 0) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int zzx() {
        /*
            r5 = this;
            int r0 = r5.zzi
            int r1 = r5.zzg
            if (r1 == r0) goto L6b
            byte[] r2 = r5.zzf
            int r3 = r0 + 1
            r0 = r2[r0]
            if (r0 < 0) goto L11
            r5.zzi = r3
            return r0
        L11:
            int r1 = r1 - r3
            r4 = 9
            if (r1 < r4) goto L6b
            int r1 = r3 + 1
            r3 = r2[r3]
            int r3 = r3 << 7
            r0 = r0 ^ r3
            if (r0 >= 0) goto L22
            r0 = r0 ^ (-128(0xffffffffffffff80, float:NaN))
            goto L68
        L22:
            int r3 = r1 + 1
            r1 = r2[r1]
            int r1 = r1 << 14
            r0 = r0 ^ r1
            if (r0 < 0) goto L2f
            r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
        L2d:
            r1 = r3
            goto L68
        L2f:
            int r1 = r3 + 1
            r3 = r2[r3]
            int r3 = r3 << 21
            r0 = r0 ^ r3
            if (r0 >= 0) goto L3d
            r2 = -2080896(0xffffffffffe03f80, float:NaN)
            r0 = r0 ^ r2
            goto L68
        L3d:
            int r3 = r1 + 1
            r1 = r2[r1]
            int r4 = r1 << 28
            r0 = r0 ^ r4
            r4 = 266354560(0xfe03f80, float:2.2112565E-29)
            r0 = r0 ^ r4
            if (r1 >= 0) goto L2d
            int r1 = r3 + 1
            r3 = r2[r3]
            if (r3 >= 0) goto L68
            int r3 = r1 + 1
            r1 = r2[r1]
            if (r1 >= 0) goto L2d
            int r1 = r3 + 1
            r3 = r2[r3]
            if (r3 >= 0) goto L68
            int r3 = r1 + 1
            r1 = r2[r1]
            if (r1 >= 0) goto L2d
            int r1 = r3 + 1
            r2 = r2[r3]
            if (r2 < 0) goto L6b
        L68:
            r5.zzi = r1
            return r0
        L6b:
            long r0 = r5.zzm()
            int r0 = (int) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p002firebaseauthapi.zzaic.zzx():int");
    }

    private final long zzy() {
        int i10 = this.zzi;
        if (this.zzg - i10 < 8) {
            zzg(8);
            i10 = this.zzi;
        }
        byte[] bArr = this.zzf;
        this.zzi = i10 + 8;
        return ((bArr[i10 + 7] & 255) << 56) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16) | ((bArr[i10 + 3] & 255) << 24) | ((bArr[i10 + 4] & 255) << 32) | ((bArr[i10 + 5] & 255) << 40) | ((bArr[i10 + 6] & 255) << 48);
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00b0, code lost:
    
        if (r2[r0] >= 0) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final long zzz() {
        /*
            Method dump skipped, instructions count: 189
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p002firebaseauthapi.zzaic.zzz():long");
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaib
    public final double zza() {
        return Double.longBitsToDouble(zzy());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaib
    public final float zzb() {
        return Float.intBitsToFloat(zzw());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaib
    public final int zzc() {
        return this.zzk + this.zzi;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaib
    public final int zzd() {
        return zzx();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaib
    public final int zze() {
        return zzw();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaib
    public final int zzf() {
        return zzx();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaib
    public final int zzg() {
        return zzw();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaib
    public final int zzh() {
        return zzaib.zze(zzx());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaib
    public final int zzi() {
        if (zzt()) {
            this.zzj = 0;
            return 0;
        }
        int zzx = zzx();
        this.zzj = zzx;
        if ((zzx >>> 3) != 0) {
            return zzx;
        }
        throw zzajj.zzc();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaib
    public final int zzj() {
        return zzx();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaib
    public final long zzk() {
        return zzy();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaib
    public final long zzl() {
        return zzz();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaib
    public final long zzm() {
        long j4 = 0;
        for (int i10 = 0; i10 < 64; i10 += 7) {
            j4 |= (r3 & Byte.MAX_VALUE) << i10;
            if ((zzv() & 128) == 0) {
                return j4;
            }
        }
        throw zzajj.zze();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaib
    public final long zzn() {
        return zzy();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaib
    public final long zzo() {
        return zzaib.zza(zzz());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaib
    public final long zzp() {
        return zzz();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaib
    public final zzahm zzq() {
        int zzx = zzx();
        int i10 = this.zzg;
        int i11 = this.zzi;
        if (zzx <= i10 - i11 && zzx > 0) {
            zzahm zza = zzahm.zza(this.zzf, i11, zzx);
            this.zzi += zzx;
            return zza;
        }
        if (zzx == 0) {
            return zzahm.zza;
        }
        byte[] zzj = zzj(zzx);
        if (zzj != null) {
            return zzahm.zza(zzj);
        }
        int i12 = this.zzi;
        int i13 = this.zzg;
        int i14 = i13 - i12;
        this.zzk += i13;
        this.zzi = 0;
        this.zzg = 0;
        List<byte[]> zzf = zzf(zzx - i14);
        byte[] bArr = new byte[zzx];
        System.arraycopy(this.zzf, i12, bArr, 0, i14);
        for (byte[] bArr2 : zzf) {
            System.arraycopy(bArr2, 0, bArr, i14, bArr2.length);
            i14 += bArr2.length;
        }
        return zzahm.zzb(bArr);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaib
    public final String zzr() {
        int zzx = zzx();
        if (zzx > 0) {
            int i10 = this.zzg;
            int i11 = this.zzi;
            if (zzx <= i10 - i11) {
                String str = new String(this.zzf, i11, zzx, zzajc.zza);
                this.zzi += zzx;
                return str;
            }
        }
        if (zzx == 0) {
            return "";
        }
        if (zzx <= this.zzg) {
            zzg(zzx);
            String str2 = new String(this.zzf, this.zzi, zzx, zzajc.zza);
            this.zzi += zzx;
            return str2;
        }
        return new String(zza(zzx, false), zzajc.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaib
    public final String zzs() {
        byte[] zza;
        int zzx = zzx();
        int i10 = this.zzi;
        int i11 = this.zzg;
        if (zzx <= i11 - i10 && zzx > 0) {
            zza = this.zzf;
            this.zzi = i10 + zzx;
        } else {
            if (zzx == 0) {
                return "";
            }
            i10 = 0;
            if (zzx <= i11) {
                zzg(zzx);
                zza = this.zzf;
                this.zzi = zzx;
            } else {
                zza = zza(zzx, false);
            }
        }
        return zzaml.zzb(zza, i10, zzx);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaib
    public final boolean zzt() {
        if (this.zzi == this.zzg && !zzi(1)) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaib
    public final boolean zzu() {
        if (zzz() != 0) {
            return true;
        }
        return false;
    }

    private zzaic(InputStream inputStream, int i10) {
        super();
        this.zzl = f.API_PRIORITY_OTHER;
        this.zzm = null;
        zzajc.zza(inputStream, "input");
        this.zze = inputStream;
        this.zzf = new byte[4096];
        this.zzg = 0;
        this.zzi = 0;
        this.zzk = 0;
    }

    private static int zza(InputStream inputStream) {
        try {
            return inputStream.available();
        } catch (zzajj e10) {
            e10.zzj();
            throw e10;
        }
    }

    private final List<byte[]> zzf(int i10) {
        ArrayList arrayList = new ArrayList();
        while (i10 > 0) {
            int min = Math.min(i10, 4096);
            byte[] bArr = new byte[min];
            int i11 = 0;
            while (i11 < min) {
                int read = this.zze.read(bArr, i11, min - i11);
                if (read != -1) {
                    this.zzk += read;
                    i11 += read;
                } else {
                    throw zzajj.zzi();
                }
            }
            i10 -= min;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    private final void zzg(int i10) {
        if (zzi(i10)) {
            return;
        }
        if (i10 > (this.zzc - this.zzk) - this.zzi) {
            throw zzajj.zzh();
        }
        throw zzajj.zzi();
    }

    private final void zzh(int i10) {
        int i11 = this.zzg;
        int i12 = this.zzi;
        if (i10 <= i11 - i12 && i10 >= 0) {
            this.zzi = i12 + i10;
            return;
        }
        if (i10 >= 0) {
            int i13 = this.zzk;
            int i14 = i13 + i12 + i10;
            int i15 = this.zzl;
            if (i14 <= i15) {
                this.zzk = i13 + i12;
                int i16 = i11 - i12;
                this.zzg = 0;
                this.zzi = 0;
                while (i16 < i10) {
                    try {
                        long j4 = i10 - i16;
                        long zza = zza(this.zze, j4);
                        if (zza >= 0 && zza <= j4) {
                            if (zza == 0) {
                                break;
                            } else {
                                i16 += (int) zza;
                            }
                        } else {
                            throw new IllegalStateException(String.valueOf(this.zze.getClass()) + "#skip returned invalid result: " + zza + "\nThe InputStream implementation is buggy.");
                        }
                    } finally {
                        this.zzk += i16;
                        zzaa();
                    }
                }
                if (i16 >= i10) {
                    return;
                }
                int i17 = this.zzg;
                int i18 = i17 - this.zzi;
                this.zzi = i17;
                zzg(1);
                while (true) {
                    int i19 = i10 - i18;
                    int i20 = this.zzg;
                    if (i19 > i20) {
                        i18 += i20;
                        this.zzi = i20;
                        zzg(1);
                    } else {
                        this.zzi = i19;
                        return;
                    }
                }
            } else {
                zzh((i15 - i13) - i12);
                throw zzajj.zzi();
            }
        } else {
            throw zzajj.zzf();
        }
    }

    private final byte[] zzj(int i10) {
        if (i10 == 0) {
            return zzajc.zzb;
        }
        if (i10 >= 0) {
            int i11 = this.zzk;
            int i12 = this.zzi;
            int i13 = i11 + i12 + i10;
            if (i13 - this.zzc <= 0) {
                int i14 = this.zzl;
                if (i13 <= i14) {
                    int i15 = this.zzg - i12;
                    int i16 = i10 - i15;
                    if (i16 >= 4096 && i16 > zza(this.zze)) {
                        return null;
                    }
                    byte[] bArr = new byte[i10];
                    System.arraycopy(this.zzf, this.zzi, bArr, 0, i15);
                    this.zzk += this.zzg;
                    this.zzi = 0;
                    this.zzg = 0;
                    while (i15 < i10) {
                        int zza = zza(this.zze, bArr, i15, i10 - i15);
                        if (zza != -1) {
                            this.zzk += zza;
                            i15 += zza;
                        } else {
                            throw zzajj.zzi();
                        }
                    }
                    return bArr;
                }
                zzh((i14 - i11) - i12);
                throw zzajj.zzi();
            }
            throw zzajj.zzh();
        }
        throw zzajj.zzf();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaib
    public final void zzb(int i10) {
        if (this.zzj != i10) {
            throw zzajj.zzb();
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaib
    public final void zzc(int i10) {
        this.zzl = i10;
        zzaa();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaib
    public final boolean zzd(int i10) {
        int zzi;
        int i11 = i10 & 7;
        int i12 = 0;
        if (i11 == 0) {
            if (this.zzg - this.zzi >= 10) {
                while (i12 < 10) {
                    byte[] bArr = this.zzf;
                    int i13 = this.zzi;
                    this.zzi = i13 + 1;
                    if (bArr[i13] < 0) {
                        i12++;
                    }
                }
                throw zzajj.zze();
            }
            while (i12 < 10) {
                if (zzv() < 0) {
                    i12++;
                }
            }
            throw zzajj.zze();
            return true;
        }
        if (i11 == 1) {
            zzh(8);
            return true;
        }
        if (i11 != 2) {
            if (i11 != 3) {
                if (i11 == 4) {
                    return false;
                }
                if (i11 == 5) {
                    zzh(4);
                    return true;
                }
                throw zzajj.zza();
            }
            do {
                zzi = zzi();
                if (zzi == 0) {
                    break;
                }
            } while (zzd(zzi));
            zzb(((i10 >>> 3) << 3) | 4);
            return true;
        }
        zzh(zzx());
        return true;
    }

    private final boolean zzi(int i10) {
        do {
            int i11 = this.zzi;
            int i12 = i11 + i10;
            int i13 = this.zzg;
            if (i12 > i13) {
                int i14 = this.zzc;
                int i15 = this.zzk;
                if (i10 > (i14 - i15) - i11 || i15 + i11 + i10 > this.zzl) {
                    return false;
                }
                if (i11 > 0) {
                    if (i13 > i11) {
                        byte[] bArr = this.zzf;
                        System.arraycopy(bArr, i11, bArr, 0, i13 - i11);
                    }
                    this.zzk += i11;
                    this.zzg -= i11;
                    this.zzi = 0;
                }
                InputStream inputStream = this.zze;
                byte[] bArr2 = this.zzf;
                int i16 = this.zzg;
                int zza = zza(inputStream, bArr2, i16, Math.min(bArr2.length - i16, (this.zzc - this.zzk) - i16));
                if (zza == 0 || zza < -1 || zza > this.zzf.length) {
                    throw new IllegalStateException(String.valueOf(this.zze.getClass()) + "#read(byte[]) returned invalid result: " + zza + "\nThe InputStream implementation is buggy.");
                }
                if (zza <= 0) {
                    return false;
                }
                this.zzg += zza;
                zzaa();
            } else {
                throw new IllegalStateException(g.o("refillBuffer() called when ", i10, " bytes were already available in buffer"));
            }
        } while (this.zzg < i10);
        return true;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaib
    public final int zza(int i10) {
        if (i10 >= 0) {
            int i11 = this.zzk + this.zzi + i10;
            int i12 = this.zzl;
            if (i11 <= i12) {
                this.zzl = i11;
                zzaa();
                return i12;
            }
            throw zzajj.zzi();
        }
        throw zzajj.zzf();
    }

    private static int zza(InputStream inputStream, byte[] bArr, int i10, int i11) {
        try {
            return inputStream.read(bArr, i10, i11);
        } catch (zzajj e10) {
            e10.zzj();
            throw e10;
        }
    }

    private static long zza(InputStream inputStream, long j4) {
        try {
            return inputStream.skip(j4);
        } catch (zzajj e10) {
            e10.zzj();
            throw e10;
        }
    }

    private final byte[] zza(int i10, boolean z9) {
        byte[] zzj = zzj(i10);
        if (zzj != null) {
            return zzj;
        }
        int i11 = this.zzi;
        int i12 = this.zzg;
        int i13 = i12 - i11;
        this.zzk += i12;
        this.zzi = 0;
        this.zzg = 0;
        List<byte[]> zzf = zzf(i10 - i13);
        byte[] bArr = new byte[i10];
        System.arraycopy(this.zzf, i11, bArr, 0, i13);
        for (byte[] bArr2 : zzf) {
            System.arraycopy(bArr2, 0, bArr, i13, bArr2.length);
            i13 += bArr2.length;
        }
        return bArr;
    }
}
