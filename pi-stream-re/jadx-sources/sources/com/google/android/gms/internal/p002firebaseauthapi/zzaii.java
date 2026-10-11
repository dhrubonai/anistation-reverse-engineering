package com.google.android.gms.internal.p002firebaseauthapi;

import java.io.IOException;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import r.f;

/* loaded from: classes.dex */
public abstract class zzaii extends zzahn {
    private static final Logger zzb = Logger.getLogger(zzaii.class.getName());
    private static final boolean zzc = zzamh.zzc();
    zzaik zza;

    /* loaded from: classes.dex */
    public static class zza extends zzaii {
        private final byte[] zzb;
        private final int zzc;
        private final int zzd;
        private int zze;

        public zza(byte[] bArr, int i10, int i11) {
            super();
            if (bArr != null) {
                if ((i11 | 0 | (bArr.length - i11)) >= 0) {
                    this.zzb = bArr;
                    this.zzc = 0;
                    this.zze = 0;
                    this.zzd = i11;
                    return;
                }
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), 0, Integer.valueOf(i11)));
            }
            throw new NullPointerException("buffer");
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaii
        public final int zza() {
            return this.zzd - this.zze;
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaii
        public final void zzb(int i10, boolean z9) {
            zzj(i10, 0);
            zza(z9 ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaii
        public final void zzc() {
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaii
        public final void zzd(int i10, zzahm zzahmVar) {
            zzj(1, 3);
            zzk(2, i10);
            zzc(3, zzahmVar);
            zzj(1, 4);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaii
        public final void zzf(int i10, long j4) {
            zzj(i10, 1);
            zzf(j4);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaii
        public final void zzg(int i10, int i11) {
            zzj(i10, 5);
            zzi(i11);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaii
        public final void zzh(int i10, int i11) {
            zzj(i10, 0);
            zzj(i11);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaii
        public final void zzi(int i10) {
            try {
                byte[] bArr = this.zzb;
                int i11 = this.zze;
                int i12 = i11 + 1;
                bArr[i11] = (byte) i10;
                int i13 = i12 + 1;
                bArr[i12] = (byte) (i10 >> 8);
                int i14 = i13 + 1;
                bArr[i13] = (byte) (i10 >> 16);
                this.zze = i14 + 1;
                bArr[i14] = (byte) (i10 >>> 24);
            } catch (IndexOutOfBoundsException e10) {
                throw new zzd(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zze), Integer.valueOf(this.zzd), 1), e10);
            }
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaii
        public final void zzj(int i10) {
            if (i10 >= 0) {
                zzl(i10);
            } else {
                zzh(i10);
            }
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaii
        public final void zzk(int i10, int i11) {
            zzj(i10, 0);
            zzl(i11);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaii
        public final void zzl(int i10) {
            while ((i10 & (-128)) != 0) {
                try {
                    byte[] bArr = this.zzb;
                    int i11 = this.zze;
                    this.zze = i11 + 1;
                    bArr[i11] = (byte) (i10 | 128);
                    i10 >>>= 7;
                } catch (IndexOutOfBoundsException e10) {
                    throw new zzd(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zze), Integer.valueOf(this.zzd), 1), e10);
                }
            }
            byte[] bArr2 = this.zzb;
            int i12 = this.zze;
            this.zze = i12 + 1;
            bArr2[i12] = (byte) i10;
        }

        private final void zzc(byte[] bArr, int i10, int i11) {
            try {
                System.arraycopy(bArr, i10, this.zzb, this.zze, i11);
                this.zze += i11;
            } catch (IndexOutOfBoundsException e10) {
                throw new zzd(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zze), Integer.valueOf(this.zzd), Integer.valueOf(i11)), e10);
            }
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaii
        public final void zza(byte b10) {
            try {
                byte[] bArr = this.zzb;
                int i10 = this.zze;
                this.zze = i10 + 1;
                bArr[i10] = b10;
            } catch (IndexOutOfBoundsException e10) {
                throw new zzd(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zze), Integer.valueOf(this.zzd), 1), e10);
            }
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaii
        public final void zzb(byte[] bArr, int i10, int i11) {
            zzl(i11);
            zzc(bArr, 0, i11);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaii
        public final void zzf(long j4) {
            try {
                byte[] bArr = this.zzb;
                int i10 = this.zze;
                int i11 = i10 + 1;
                bArr[i10] = (byte) j4;
                int i12 = i11 + 1;
                bArr[i11] = (byte) (j4 >> 8);
                int i13 = i12 + 1;
                bArr[i12] = (byte) (j4 >> 16);
                int i14 = i13 + 1;
                bArr[i13] = (byte) (j4 >> 24);
                int i15 = i14 + 1;
                bArr[i14] = (byte) (j4 >> 32);
                int i16 = i15 + 1;
                bArr[i15] = (byte) (j4 >> 40);
                int i17 = i16 + 1;
                bArr[i16] = (byte) (j4 >> 48);
                this.zze = i17 + 1;
                bArr[i17] = (byte) (j4 >> 56);
            } catch (IndexOutOfBoundsException e10) {
                throw new zzd(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zze), Integer.valueOf(this.zzd), 1), e10);
            }
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaii
        public final void zzh(int i10, long j4) {
            zzj(i10, 0);
            zzh(j4);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaii
        public final void zzj(int i10, int i11) {
            zzl((i10 << 3) | i11);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzahn
        public final void zza(byte[] bArr, int i10, int i11) {
            zzc(bArr, i10, i11);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaii
        public final void zzb(zzahm zzahmVar) {
            zzl(zzahmVar.zzb());
            zzahmVar.zza(this);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaii
        public final void zzh(long j4) {
            if (zzaii.zzc && zza() >= 10) {
                while ((j4 & (-128)) != 0) {
                    byte[] bArr = this.zzb;
                    int i10 = this.zze;
                    this.zze = i10 + 1;
                    zzamh.zza(bArr, i10, (byte) (((int) j4) | 128));
                    j4 >>>= 7;
                }
                byte[] bArr2 = this.zzb;
                int i11 = this.zze;
                this.zze = i11 + 1;
                zzamh.zza(bArr2, i11, (byte) j4);
                return;
            }
            while ((j4 & (-128)) != 0) {
                try {
                    byte[] bArr3 = this.zzb;
                    int i12 = this.zze;
                    this.zze = i12 + 1;
                    bArr3[i12] = (byte) (((int) j4) | 128);
                    j4 >>>= 7;
                } catch (IndexOutOfBoundsException e10) {
                    throw new zzd(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zze), Integer.valueOf(this.zzd), 1), e10);
                }
            }
            byte[] bArr4 = this.zzb;
            int i13 = this.zze;
            this.zze = i13 + 1;
            bArr4[i13] = (byte) j4;
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaii
        public final void zzc(int i10, zzahm zzahmVar) {
            zzj(i10, 2);
            zzb(zzahmVar);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaii
        public final void zzb(zzakk zzakkVar, zzalc zzalcVar) {
            zzl(((zzahd) zzakkVar).zza(zzalcVar));
            zzalcVar.zza((zzalc) zzakkVar, (zzanb) this.zza);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaii
        public final void zzc(int i10, zzakk zzakkVar, zzalc zzalcVar) {
            zzj(i10, 2);
            zzl(((zzahd) zzakkVar).zza(zzalcVar));
            zzalcVar.zza((zzalc) zzakkVar, (zzanb) this.zza);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaii
        public final void zzb(int i10, zzakk zzakkVar) {
            zzj(1, 3);
            zzk(2, i10);
            zzj(3, 2);
            zzc(zzakkVar);
            zzj(1, 4);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaii
        public final void zzc(zzakk zzakkVar) {
            zzl(zzakkVar.zzk());
            zzakkVar.zza(this);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaii
        public final void zzb(int i10, String str) {
            zzj(i10, 2);
            zzb(str);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaii
        public final void zzb(String str) {
            int i10 = this.zze;
            try {
                int zzh = zzaii.zzh(str.length() * 3);
                int zzh2 = zzaii.zzh(str.length());
                if (zzh2 == zzh) {
                    int i11 = i10 + zzh2;
                    this.zze = i11;
                    int zza = zzaml.zza(str, this.zzb, i11, zza());
                    this.zze = i10;
                    zzl((zza - i10) - zzh2);
                    this.zze = zza;
                    return;
                }
                zzl(zzaml.zza(str));
                this.zze = zzaml.zza(str, this.zzb, this.zze, zza());
            } catch (zzamp e10) {
                this.zze = i10;
                zza(str, e10);
            } catch (IndexOutOfBoundsException e11) {
                throw new zzd(e11);
            }
        }
    }

    /* loaded from: classes.dex */
    public static abstract class zzb extends zzaii {
        final byte[] zzb;
        final int zzc;
        int zzd;
        int zze;

        public zzb(int i10) {
            super();
            if (i10 >= 0) {
                byte[] bArr = new byte[Math.max(i10, 20)];
                this.zzb = bArr;
                this.zzc = bArr.length;
                return;
            }
            throw new IllegalArgumentException("bufferSize must be >= 0");
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaii
        public final int zza() {
            throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
        }

        public final void zzb(byte b10) {
            byte[] bArr = this.zzb;
            int i10 = this.zzd;
            this.zzd = i10 + 1;
            bArr[i10] = b10;
            this.zze++;
        }

        public final void zzi(long j4) {
            byte[] bArr = this.zzb;
            int i10 = this.zzd;
            int i11 = i10 + 1;
            bArr[i10] = (byte) (j4 & 255);
            int i12 = i11 + 1;
            bArr[i11] = (byte) ((j4 >> 8) & 255);
            int i13 = i12 + 1;
            bArr[i12] = (byte) ((j4 >> 16) & 255);
            int i14 = i13 + 1;
            bArr[i13] = (byte) (255 & (j4 >> 24));
            int i15 = i14 + 1;
            bArr[i14] = (byte) (j4 >> 32);
            int i16 = i15 + 1;
            bArr[i15] = (byte) (j4 >> 40);
            int i17 = i16 + 1;
            bArr[i16] = (byte) (j4 >> 48);
            this.zzd = i17 + 1;
            bArr[i17] = (byte) (j4 >> 56);
            this.zze += 8;
        }

        public final void zzj(long j4) {
            if (zzaii.zzc) {
                long j10 = this.zzd;
                while ((j4 & (-128)) != 0) {
                    byte[] bArr = this.zzb;
                    int i10 = this.zzd;
                    this.zzd = i10 + 1;
                    zzamh.zza(bArr, i10, (byte) (((int) j4) | 128));
                    j4 >>>= 7;
                }
                byte[] bArr2 = this.zzb;
                int i11 = this.zzd;
                this.zzd = i11 + 1;
                zzamh.zza(bArr2, i11, (byte) j4);
                this.zze += (int) (this.zzd - j10);
                return;
            }
            while ((j4 & (-128)) != 0) {
                byte[] bArr3 = this.zzb;
                int i12 = this.zzd;
                this.zzd = i12 + 1;
                bArr3[i12] = (byte) (((int) j4) | 128);
                this.zze++;
                j4 >>>= 7;
            }
            byte[] bArr4 = this.zzb;
            int i13 = this.zzd;
            this.zzd = i13 + 1;
            bArr4[i13] = (byte) j4;
            this.zze++;
        }

        public final void zzl(int i10, int i11) {
            zzn((i10 << 3) | i11);
        }

        public final void zzm(int i10) {
            byte[] bArr = this.zzb;
            int i11 = this.zzd;
            int i12 = i11 + 1;
            bArr[i11] = (byte) i10;
            int i13 = i12 + 1;
            bArr[i12] = (byte) (i10 >> 8);
            int i14 = i13 + 1;
            bArr[i13] = (byte) (i10 >> 16);
            this.zzd = i14 + 1;
            bArr[i14] = (byte) (i10 >>> 24);
            this.zze += 4;
        }

        public final void zzn(int i10) {
            if (zzaii.zzc) {
                long j4 = this.zzd;
                while ((i10 & (-128)) != 0) {
                    byte[] bArr = this.zzb;
                    int i11 = this.zzd;
                    this.zzd = i11 + 1;
                    zzamh.zza(bArr, i11, (byte) (i10 | 128));
                    i10 >>>= 7;
                }
                byte[] bArr2 = this.zzb;
                int i12 = this.zzd;
                this.zzd = i12 + 1;
                zzamh.zza(bArr2, i12, (byte) i10);
                this.zze += (int) (this.zzd - j4);
                return;
            }
            while ((i10 & (-128)) != 0) {
                byte[] bArr3 = this.zzb;
                int i13 = this.zzd;
                this.zzd = i13 + 1;
                bArr3[i13] = (byte) (i10 | 128);
                this.zze++;
                i10 >>>= 7;
            }
            byte[] bArr4 = this.zzb;
            int i14 = this.zzd;
            this.zzd = i14 + 1;
            bArr4[i14] = (byte) i10;
            this.zze++;
        }
    }

    public static int zza(double d10) {
        return 8;
    }

    public static int zzb(int i10) {
        return 4;
    }

    public static int zzc(long j4) {
        return 8;
    }

    public static int zzd(int i10) {
        if (i10 > 4096) {
            return 4096;
        }
        return i10;
    }

    public static int zze(int i10) {
        return 4;
    }

    public static int zzf(int i10) {
        return zzh(zzm(i10));
    }

    public static int zzg(int i10) {
        return zzh(i10 << 3);
    }

    public static int zzh(int i10) {
        return (352 - (Integer.numberOfLeadingZeros(i10) * 9)) >>> 6;
    }

    private static long zzi(long j4) {
        return (j4 >> 63) ^ (j4 << 1);
    }

    private static int zzm(int i10) {
        return (i10 >> 31) ^ (i10 << 1);
    }

    public abstract int zza();

    public abstract void zza(byte b10);

    public abstract void zzb(int i10, zzakk zzakkVar);

    public abstract void zzb(int i10, String str);

    public abstract void zzb(int i10, boolean z9);

    public abstract void zzb(zzahm zzahmVar);

    public abstract void zzb(zzakk zzakkVar, zzalc zzalcVar);

    public abstract void zzb(String str);

    public abstract void zzb(byte[] bArr, int i10, int i11);

    public abstract void zzc();

    public abstract void zzc(int i10, zzahm zzahmVar);

    public abstract void zzc(int i10, zzakk zzakkVar, zzalc zzalcVar);

    public abstract void zzc(zzakk zzakkVar);

    public abstract void zzd(int i10, zzahm zzahmVar);

    public abstract void zzf(int i10, long j4);

    public abstract void zzf(long j4);

    public abstract void zzg(int i10, int i11);

    public abstract void zzh(int i10, int i11);

    public abstract void zzh(int i10, long j4);

    public abstract void zzh(long j4);

    public abstract void zzi(int i10);

    public abstract void zzj(int i10);

    public abstract void zzj(int i10, int i11);

    public final void zzk(int i10) {
        zzl(zzm(i10));
    }

    public abstract void zzk(int i10, int i11);

    public abstract void zzl(int i10);

    /* loaded from: classes.dex */
    public static final class zzc extends zzb {
        private final OutputStream zzf;

        public zzc(OutputStream outputStream, int i10) {
            super(i10);
            if (outputStream != null) {
                this.zzf = outputStream;
                return;
            }
            throw new NullPointerException("out");
        }

        private final void zze() {
            this.zzf.write(this.zzb, 0, this.zzd);
            this.zzd = 0;
        }

        private final void zzo(int i10) {
            if (this.zzc - this.zzd < i10) {
                zze();
            }
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaii
        public final void zza(byte b10) {
            if (this.zzd == this.zzc) {
                zze();
            }
            zzb(b10);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaii
        public final void zzb(int i10, boolean z9) {
            zzo(11);
            zzl(i10, 0);
            zzb(z9 ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaii
        public final void zzc() {
            if (this.zzd > 0) {
                zze();
            }
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaii
        public final void zzd(int i10, zzahm zzahmVar) {
            zzj(1, 3);
            zzk(2, i10);
            zzc(3, zzahmVar);
            zzj(1, 4);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaii
        public final void zzf(int i10, long j4) {
            zzo(18);
            zzl(i10, 1);
            zzi(j4);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaii
        public final void zzg(int i10, int i11) {
            zzo(14);
            zzl(i10, 5);
            zzm(i11);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaii
        public final void zzh(int i10, int i11) {
            zzo(20);
            zzl(i10, 0);
            if (i11 >= 0) {
                zzn(i11);
            } else {
                zzj(i11);
            }
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaii
        public final void zzi(int i10) {
            zzo(4);
            zzm(i10);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaii
        public final void zzj(int i10) {
            if (i10 >= 0) {
                zzl(i10);
            } else {
                zzh(i10);
            }
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaii
        public final void zzk(int i10, int i11) {
            zzo(20);
            zzl(i10, 0);
            zzn(i11);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaii
        public final void zzl(int i10) {
            zzo(5);
            zzn(i10);
        }

        private final void zzc(byte[] bArr, int i10, int i11) {
            int i12 = this.zzc;
            int i13 = this.zzd;
            if (i12 - i13 >= i11) {
                System.arraycopy(bArr, i10, this.zzb, i13, i11);
                this.zzd += i11;
            } else {
                int i14 = i12 - i13;
                System.arraycopy(bArr, i10, this.zzb, i13, i14);
                int i15 = i10 + i14;
                i11 -= i14;
                this.zzd = this.zzc;
                this.zze += i14;
                zze();
                if (i11 <= this.zzc) {
                    System.arraycopy(bArr, i15, this.zzb, 0, i11);
                    this.zzd = i11;
                } else {
                    this.zzf.write(bArr, i15, i11);
                }
            }
            this.zze += i11;
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaii
        public final void zzj(int i10, int i11) {
            zzl((i10 << 3) | i11);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzahn
        public final void zza(byte[] bArr, int i10, int i11) {
            zzc(bArr, i10, i11);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaii
        public final void zzb(byte[] bArr, int i10, int i11) {
            zzl(i11);
            zzc(bArr, 0, i11);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaii
        public final void zzf(long j4) {
            zzo(8);
            zzi(j4);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaii
        public final void zzh(int i10, long j4) {
            zzo(20);
            zzl(i10, 0);
            zzj(j4);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaii
        public final void zzb(zzahm zzahmVar) {
            zzl(zzahmVar.zzb());
            zzahmVar.zza(this);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaii
        public final void zzb(zzakk zzakkVar, zzalc zzalcVar) {
            zzl(((zzahd) zzakkVar).zza(zzalcVar));
            zzalcVar.zza((zzalc) zzakkVar, (zzanb) this.zza);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaii
        public final void zzh(long j4) {
            zzo(10);
            zzj(j4);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaii
        public final void zzb(int i10, zzakk zzakkVar) {
            zzj(1, 3);
            zzk(2, i10);
            zzj(3, 2);
            zzc(zzakkVar);
            zzj(1, 4);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaii
        public final void zzb(int i10, String str) {
            zzj(i10, 2);
            zzb(str);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaii
        public final void zzc(int i10, zzahm zzahmVar) {
            zzj(i10, 2);
            zzb(zzahmVar);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaii
        public final void zzb(String str) {
            int zza;
            try {
                int length = str.length() * 3;
                int zzh = zzaii.zzh(length);
                int i10 = zzh + length;
                int i11 = this.zzc;
                if (i10 > i11) {
                    byte[] bArr = new byte[length];
                    int zza2 = zzaml.zza(str, bArr, 0, length);
                    zzl(zza2);
                    zza(bArr, 0, zza2);
                    return;
                }
                if (i10 > i11 - this.zzd) {
                    zze();
                }
                int zzh2 = zzaii.zzh(str.length());
                int i12 = this.zzd;
                try {
                    if (zzh2 == zzh) {
                        int i13 = i12 + zzh2;
                        this.zzd = i13;
                        int zza3 = zzaml.zza(str, this.zzb, i13, this.zzc - i13);
                        this.zzd = i12;
                        zza = (zza3 - i12) - zzh2;
                        zzn(zza);
                        this.zzd = zza3;
                    } else {
                        zza = zzaml.zza(str);
                        zzn(zza);
                        this.zzd = zzaml.zza(str, this.zzb, this.zzd, zza);
                    }
                    this.zze += zza;
                } catch (zzamp e10) {
                    this.zze -= this.zzd - i12;
                    this.zzd = i12;
                    throw e10;
                } catch (ArrayIndexOutOfBoundsException e11) {
                    throw new zzd(e11);
                }
            } catch (zzamp e12) {
                zza(str, e12);
            }
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaii
        public final void zzc(int i10, zzakk zzakkVar, zzalc zzalcVar) {
            zzj(i10, 2);
            zzb(zzakkVar, zzalcVar);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaii
        public final void zzc(zzakk zzakkVar) {
            zzl(zzakkVar.zzk());
            zzakkVar.zza(this);
        }
    }

    private zzaii() {
    }

    public static int zza(float f10) {
        return 4;
    }

    public static int zzb(int i10, int i11) {
        return zzh(i10 << 3) + 4;
    }

    public static int zzc(int i10, int i11) {
        return zze(i11) + zzh(i10 << 3);
    }

    public static int zze(int i10, int i11) {
        return zzh(zzm(i11)) + zzh(i10 << 3);
    }

    public static int zzf(int i10, int i11) {
        return zzh(i11) + zzh(i10 << 3);
    }

    public final void zzg(int i10, long j4) {
        zzh(i10, zzi(j4));
    }

    public final void zzi(int i10, int i11) {
        zzk(i10, zzm(i11));
    }

    public static int zza(long j4) {
        return 8;
    }

    public static int zzb(int i10, long j4) {
        return zze(j4) + zzh(i10 << 3);
    }

    public static int zzd(int i10, int i11) {
        return zzh(i10 << 3) + 4;
    }

    public final void zzg(long j4) {
        zzh(zzi(j4));
    }

    public static int zza(boolean z9) {
        return 1;
    }

    public static int zzc(int i10) {
        return zze(i10);
    }

    public static int zzd(int i10, long j4) {
        return zze(zzi(j4)) + zzh(i10 << 3);
    }

    public static int zze(int i10, long j4) {
        return zze(j4) + zzh(i10 << 3);
    }

    public static int zza(int i10, boolean z9) {
        return zzh(i10 << 3) + 1;
    }

    public static int zzb(long j4) {
        return zze(j4);
    }

    public static int zzc(int i10, long j4) {
        return zzh(i10 << 3) + 8;
    }

    public static int zza(byte[] bArr) {
        int length = bArr.length;
        return zzh(length) + length;
    }

    public static int zzb(int i10, zzajo zzajoVar) {
        int zzh = zzh(i10 << 3);
        int zzb2 = zzajoVar.zzb();
        return zzh(zzb2) + zzb2 + zzh;
    }

    public static int zzd(long j4) {
        return zze(zzi(j4));
    }

    public static int zze(long j4) {
        return (640 - (Long.numberOfLeadingZeros(j4) * 9)) >>> 6;
    }

    public static int zza(int i10, zzahm zzahmVar) {
        int zzh = zzh(i10 << 3);
        int zzb2 = zzahmVar.zzb();
        return zzh(zzb2) + zzb2 + zzh;
    }

    public static int zzb(int i10, zzakk zzakkVar, zzalc zzalcVar) {
        return zza(zzakkVar, zzalcVar) + zzh(i10 << 3);
    }

    /* loaded from: classes.dex */
    public static class zzd extends IOException {
        public zzd(String str, Throwable th) {
            super(f.d("CodedOutputStream was writing to a flat byte array and ran out of space.: ", str), th);
        }

        public zzd() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }

        public zzd(Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
        }
    }

    public static int zza(zzahm zzahmVar) {
        int zzb2 = zzahmVar.zzb();
        return zzh(zzb2) + zzb2;
    }

    public static int zzb(zzakk zzakkVar) {
        int zzk = zzakkVar.zzk();
        return zzh(zzk) + zzk;
    }

    public static int zza(int i10, double d10) {
        return zzh(i10 << 3) + 8;
    }

    public static int zzb(int i10, zzahm zzahmVar) {
        return zza(3, zzahmVar) + zzf(2, i10) + (zzh(8) << 1);
    }

    public static int zza(int i10, int i11) {
        return zze(i11) + zzh(i10 << 3);
    }

    public static int zza(int i10) {
        return zze(i10);
    }

    public static zzaii zzb(byte[] bArr) {
        return new zza(bArr, 0, bArr.length);
    }

    public static int zza(int i10, long j4) {
        return zzh(i10 << 3) + 8;
    }

    public static int zza(int i10, float f10) {
        return zzh(i10 << 3) + 4;
    }

    public final void zzb() {
        if (zza() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    @Deprecated
    public static int zza(int i10, zzakk zzakkVar, zzalc zzalcVar) {
        return ((zzahd) zzakkVar).zza(zzalcVar) + (zzh(i10 << 3) << 1);
    }

    public final void zzb(boolean z9) {
        zza(z9 ? (byte) 1 : (byte) 0);
    }

    @Deprecated
    public static int zza(zzakk zzakkVar) {
        return zzakkVar.zzk();
    }

    public final void zzb(int i10, double d10) {
        zzf(i10, Double.doubleToRawLongBits(d10));
    }

    public static int zza(int i10, zzajo zzajoVar) {
        return zzb(3, zzajoVar) + zzf(2, i10) + (zzh(8) << 1);
    }

    public final void zzb(double d10) {
        zzf(Double.doubleToRawLongBits(d10));
    }

    public final void zzb(int i10, float f10) {
        zzg(i10, Float.floatToRawIntBits(f10));
    }

    public final void zzb(float f10) {
        zzi(Float.floatToRawIntBits(f10));
    }

    public static int zza(zzajo zzajoVar) {
        int zzb2 = zzajoVar.zzb();
        return zzh(zzb2) + zzb2;
    }

    public static int zza(int i10, zzakk zzakkVar) {
        return zzb(zzakkVar) + zzh(24) + zzf(2, i10) + (zzh(8) << 1);
    }

    public static int zza(zzakk zzakkVar, zzalc zzalcVar) {
        int zza2 = ((zzahd) zzakkVar).zza(zzalcVar);
        return zzh(zza2) + zza2;
    }

    public static int zza(int i10, String str) {
        return zza(str) + zzh(i10 << 3);
    }

    public static int zza(String str) {
        int length;
        try {
            length = zzaml.zza(str);
        } catch (zzamp unused) {
            length = str.getBytes(zzajc.zza).length;
        }
        return zzh(length) + length;
    }

    public static zzaii zza(OutputStream outputStream, int i10) {
        return new zzc(outputStream, i10);
    }

    public final void zza(String str, zzamp zzampVar) {
        zzb.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) zzampVar);
        byte[] bytes = str.getBytes(zzajc.zza);
        try {
            zzl(bytes.length);
            zza(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e10) {
            throw new zzd(e10);
        }
    }
}
