package com.google.android.gms.internal.p002firebaseauthapi;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzamh {
    static final boolean zza;
    private static final Unsafe zzb;
    private static final Class<?> zzc;
    private static final boolean zzd;
    private static final boolean zze;
    private static final zzb zzf;
    private static final boolean zzg;
    private static final boolean zzh;
    private static final long zzi;
    private static final long zzj;
    private static final long zzk;
    private static final long zzl;
    private static final long zzm;
    private static final long zzn;
    private static final long zzo;
    private static final long zzp;
    private static final long zzq;
    private static final long zzr;
    private static final long zzs;
    private static final long zzt;
    private static final long zzu;
    private static final long zzv;
    private static final int zzw;

    /* loaded from: classes.dex */
    public static final class zza extends zzb {
        public zza(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.android.gms.internal.firebase-auth-api.zzamh.zzb
        public final double zza(Object obj, long j4) {
            return Double.longBitsToDouble(zze(obj, j4));
        }

        @Override // com.google.android.gms.internal.firebase-auth-api.zzamh.zzb
        public final float zzb(Object obj, long j4) {
            return Float.intBitsToFloat(zzd(obj, j4));
        }

        @Override // com.google.android.gms.internal.firebase-auth-api.zzamh.zzb
        public final boolean zzc(Object obj, long j4) {
            if (zzamh.zza) {
                return zzamh.zzf(obj, j4);
            }
            return zzamh.zzg(obj, j4);
        }

        @Override // com.google.android.gms.internal.firebase-auth-api.zzamh.zzb
        public final void zza(Object obj, long j4, boolean z9) {
            if (zzamh.zza) {
                zzamh.zza(obj, j4, z9);
            } else {
                zzamh.zzb(obj, j4, z9);
            }
        }

        @Override // com.google.android.gms.internal.firebase-auth-api.zzamh.zzb
        public final void zza(Object obj, long j4, byte b10) {
            if (!zzamh.zza) {
                zzamh.zzd(obj, j4, b10);
            } else {
                zzamh.zzc(obj, j4, b10);
            }
        }

        @Override // com.google.android.gms.internal.firebase-auth-api.zzamh.zzb
        public final void zza(Object obj, long j4, double d10) {
            zza(obj, j4, Double.doubleToLongBits(d10));
        }

        @Override // com.google.android.gms.internal.firebase-auth-api.zzamh.zzb
        public final void zza(Object obj, long j4, float f10) {
            zza(obj, j4, Float.floatToIntBits(f10));
        }
    }

    /* loaded from: classes.dex */
    public static abstract class zzb {
        Unsafe zza;

        public zzb(Unsafe unsafe) {
            this.zza = unsafe;
        }

        public abstract double zza(Object obj, long j4);

        public abstract void zza(Object obj, long j4, byte b10);

        public abstract void zza(Object obj, long j4, double d10);

        public abstract void zza(Object obj, long j4, float f10);

        public final void zza(Object obj, long j4, int i10) {
            this.zza.putInt(obj, j4, i10);
        }

        public abstract void zza(Object obj, long j4, boolean z9);

        public abstract float zzb(Object obj, long j4);

        public final boolean zzb() {
            Unsafe unsafe = this.zza;
            if (unsafe == null) {
                return false;
            }
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                cls.getMethod("getLong", Object.class, Long.TYPE);
                return zzamh.zza() != null;
            } catch (Throwable th) {
                zzamh.zza(th);
                return false;
            }
        }

        public abstract boolean zzc(Object obj, long j4);

        public final int zzd(Object obj, long j4) {
            return this.zza.getInt(obj, j4);
        }

        public final long zze(Object obj, long j4) {
            return this.zza.getLong(obj, j4);
        }

        public final void zza(Object obj, long j4, long j10) {
            this.zza.putLong(obj, j4, j10);
        }

        public final boolean zza() {
            Unsafe unsafe = this.zza;
            if (unsafe == null) {
                return false;
            }
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                cls.getMethod("arrayBaseOffset", Class.class);
                cls.getMethod("arrayIndexScale", Class.class);
                Class<?> cls2 = Long.TYPE;
                cls.getMethod("getInt", Object.class, cls2);
                cls.getMethod("putInt", Object.class, cls2, Integer.TYPE);
                cls.getMethod("getLong", Object.class, cls2);
                cls.getMethod("putLong", Object.class, cls2, cls2);
                cls.getMethod("getObject", Object.class, cls2);
                cls.getMethod("putObject", Object.class, cls2, Object.class);
                return true;
            } catch (Throwable th) {
                zzamh.zza(th);
                return false;
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class zzc extends zzb {
        public zzc(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.android.gms.internal.firebase-auth-api.zzamh.zzb
        public final double zza(Object obj, long j4) {
            return Double.longBitsToDouble(zze(obj, j4));
        }

        @Override // com.google.android.gms.internal.firebase-auth-api.zzamh.zzb
        public final float zzb(Object obj, long j4) {
            return Float.intBitsToFloat(zzd(obj, j4));
        }

        @Override // com.google.android.gms.internal.firebase-auth-api.zzamh.zzb
        public final boolean zzc(Object obj, long j4) {
            if (zzamh.zza) {
                return zzamh.zzf(obj, j4);
            }
            return zzamh.zzg(obj, j4);
        }

        @Override // com.google.android.gms.internal.firebase-auth-api.zzamh.zzb
        public final void zza(Object obj, long j4, boolean z9) {
            if (zzamh.zza) {
                zzamh.zza(obj, j4, z9);
            } else {
                zzamh.zzb(obj, j4, z9);
            }
        }

        @Override // com.google.android.gms.internal.firebase-auth-api.zzamh.zzb
        public final void zza(Object obj, long j4, byte b10) {
            if (!zzamh.zza) {
                zzamh.zzd(obj, j4, b10);
            } else {
                zzamh.zzc(obj, j4, b10);
            }
        }

        @Override // com.google.android.gms.internal.firebase-auth-api.zzamh.zzb
        public final void zza(Object obj, long j4, double d10) {
            zza(obj, j4, Double.doubleToLongBits(d10));
        }

        @Override // com.google.android.gms.internal.firebase-auth-api.zzamh.zzb
        public final void zza(Object obj, long j4, float f10) {
            zza(obj, j4, Float.floatToIntBits(f10));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0034  */
    static {
        /*
            sun.misc.Unsafe r0 = zzb()
            com.google.android.gms.internal.p002firebaseauthapi.zzamh.zzb = r0
            java.lang.Class r1 = com.google.android.gms.internal.p002firebaseauthapi.zzahj.zza()
            com.google.android.gms.internal.p002firebaseauthapi.zzamh.zzc = r1
            java.lang.Class r1 = java.lang.Long.TYPE
            boolean r1 = zzd(r1)
            com.google.android.gms.internal.p002firebaseauthapi.zzamh.zzd = r1
            java.lang.Class r2 = java.lang.Integer.TYPE
            boolean r2 = zzd(r2)
            com.google.android.gms.internal.p002firebaseauthapi.zzamh.zze = r2
            if (r0 == 0) goto L2e
            if (r1 == 0) goto L26
            com.google.android.gms.internal.firebase-auth-api.zzamh$zzc r1 = new com.google.android.gms.internal.firebase-auth-api.zzamh$zzc
            r1.<init>(r0)
            goto L2f
        L26:
            if (r2 == 0) goto L2e
            com.google.android.gms.internal.firebase-auth-api.zzamh$zza r1 = new com.google.android.gms.internal.firebase-auth-api.zzamh$zza
            r1.<init>(r0)
            goto L2f
        L2e:
            r1 = 0
        L2f:
            com.google.android.gms.internal.p002firebaseauthapi.zzamh.zzf = r1
            r0 = 0
            if (r1 != 0) goto L36
            r2 = r0
            goto L3a
        L36:
            boolean r2 = r1.zzb()
        L3a:
            com.google.android.gms.internal.p002firebaseauthapi.zzamh.zzg = r2
            if (r1 != 0) goto L40
            r2 = r0
            goto L44
        L40:
            boolean r2 = r1.zza()
        L44:
            com.google.android.gms.internal.p002firebaseauthapi.zzamh.zzh = r2
            java.lang.Class<byte[]> r2 = byte[].class
            int r2 = zzb(r2)
            long r2 = (long) r2
            com.google.android.gms.internal.p002firebaseauthapi.zzamh.zzi = r2
            java.lang.Class<boolean[]> r4 = boolean[].class
            int r5 = zzb(r4)
            long r5 = (long) r5
            com.google.android.gms.internal.p002firebaseauthapi.zzamh.zzj = r5
            int r4 = zzc(r4)
            long r4 = (long) r4
            com.google.android.gms.internal.p002firebaseauthapi.zzamh.zzk = r4
            java.lang.Class<int[]> r4 = int[].class
            int r5 = zzb(r4)
            long r5 = (long) r5
            com.google.android.gms.internal.p002firebaseauthapi.zzamh.zzl = r5
            int r4 = zzc(r4)
            long r4 = (long) r4
            com.google.android.gms.internal.p002firebaseauthapi.zzamh.zzm = r4
            java.lang.Class<long[]> r4 = long[].class
            int r5 = zzb(r4)
            long r5 = (long) r5
            com.google.android.gms.internal.p002firebaseauthapi.zzamh.zzn = r5
            int r4 = zzc(r4)
            long r4 = (long) r4
            com.google.android.gms.internal.p002firebaseauthapi.zzamh.zzo = r4
            java.lang.Class<float[]> r4 = float[].class
            int r5 = zzb(r4)
            long r5 = (long) r5
            com.google.android.gms.internal.p002firebaseauthapi.zzamh.zzp = r5
            int r4 = zzc(r4)
            long r4 = (long) r4
            com.google.android.gms.internal.p002firebaseauthapi.zzamh.zzq = r4
            java.lang.Class<double[]> r4 = double[].class
            int r5 = zzb(r4)
            long r5 = (long) r5
            com.google.android.gms.internal.p002firebaseauthapi.zzamh.zzr = r5
            int r4 = zzc(r4)
            long r4 = (long) r4
            com.google.android.gms.internal.p002firebaseauthapi.zzamh.zzs = r4
            java.lang.Class<java.lang.Object[]> r4 = java.lang.Object[].class
            int r5 = zzb(r4)
            long r5 = (long) r5
            com.google.android.gms.internal.p002firebaseauthapi.zzamh.zzt = r5
            int r4 = zzc(r4)
            long r4 = (long) r4
            com.google.android.gms.internal.p002firebaseauthapi.zzamh.zzu = r4
            java.lang.reflect.Field r4 = zze()
            if (r4 == 0) goto Lbf
            if (r1 != 0) goto Lb8
            goto Lbf
        Lb8:
            sun.misc.Unsafe r1 = r1.zza
            long r4 = r1.objectFieldOffset(r4)
            goto Lc1
        Lbf:
            r4 = -1
        Lc1:
            com.google.android.gms.internal.p002firebaseauthapi.zzamh.zzv = r4
            r4 = 7
            long r1 = r2 & r4
            int r1 = (int) r1
            com.google.android.gms.internal.p002firebaseauthapi.zzamh.zzw = r1
            java.nio.ByteOrder r1 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteOrder r2 = java.nio.ByteOrder.BIG_ENDIAN
            if (r1 != r2) goto Ld3
            r0 = 1
        Ld3:
            com.google.android.gms.internal.p002firebaseauthapi.zzamh.zza = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p002firebaseauthapi.zzamh.<clinit>():void");
    }

    private zzamh() {
    }

    public static /* synthetic */ Field zza() {
        return zze();
    }

    private static int zzc(Class<?> cls) {
        if (zzh) {
            return zzf.zza.arrayIndexScale(cls);
        }
        return -1;
    }

    public static long zzd(Object obj, long j4) {
        return zzf.zze(obj, j4);
    }

    public static Object zze(Object obj, long j4) {
        return zzf.zza.getObject(obj, j4);
    }

    public static /* synthetic */ boolean zzf(Object obj, long j4) {
        if (((byte) (zzc(obj, (-4) & j4) >>> ((int) (((~j4) & 3) << 3)))) != 0) {
            return true;
        }
        return false;
    }

    public static /* synthetic */ boolean zzg(Object obj, long j4) {
        if (((byte) (zzc(obj, (-4) & j4) >>> ((int) ((j4 & 3) << 3)))) != 0) {
            return true;
        }
        return false;
    }

    public static boolean zzh(Object obj, long j4) {
        return zzf.zzc(obj, j4);
    }

    public static float zzb(Object obj, long j4) {
        return zzf.zzb(obj, j4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzd(Object obj, long j4, byte b10) {
        long j10 = (-4) & j4;
        int i10 = (((int) j4) & 3) << 3;
        zza(obj, j10, ((255 & b10) << i10) | (zzc(obj, j10) & (~(255 << i10))));
    }

    public static double zza(Object obj, long j4) {
        return zzf.zza(obj, j4);
    }

    private static int zzb(Class<?> cls) {
        if (zzh) {
            return zzf.zza.arrayBaseOffset(cls);
        }
        return -1;
    }

    public static int zzc(Object obj, long j4) {
        return zzf.zzd(obj, j4);
    }

    private static Field zze() {
        Field zza2 = zza((Class<?>) Buffer.class, "effectiveDirectAddress");
        if (zza2 != null) {
            return zza2;
        }
        Field zza3 = zza((Class<?>) Buffer.class, "address");
        if (zza3 == null || zza3.getType() != Long.TYPE) {
            return null;
        }
        return zza3;
    }

    public static <T> T zza(Class<T> cls) {
        try {
            return (T) zzb.allocateInstance(cls);
        } catch (InstantiationException e10) {
            throw new IllegalStateException(e10);
        }
    }

    public static void zzc(Object obj, long j4, boolean z9) {
        zzf.zza(obj, j4, z9);
    }

    private static boolean zzd(Class<?> cls) {
        try {
            Class<?> cls2 = zzc;
            Class<?> cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class<?> cls4 = Integer.TYPE;
            cls2.getMethod("pokeInt", cls, cls4, cls3);
            cls2.getMethod("peekInt", cls, cls3);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
            cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static Unsafe zzb() {
        try {
            return (Unsafe) AccessController.doPrivileged(new zzamj());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzc(Object obj, long j4, byte b10) {
        long j10 = (-4) & j4;
        int zzc2 = zzc(obj, j10);
        int i10 = ((~((int) j4)) & 3) << 3;
        zza(obj, j10, ((255 & b10) << i10) | (zzc2 & (~(255 << i10))));
    }

    private static Field zza(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static /* synthetic */ void zza(Throwable th) {
        Logger.getLogger(zzamh.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(String.valueOf(th)));
    }

    public static /* synthetic */ void zzb(Object obj, long j4, boolean z9) {
        zzd(obj, j4, z9 ? (byte) 1 : (byte) 0);
    }

    public static boolean zzc() {
        return zzh;
    }

    public static /* synthetic */ void zza(Object obj, long j4, boolean z9) {
        zzc(obj, j4, z9 ? (byte) 1 : (byte) 0);
    }

    public static void zza(byte[] bArr, long j4, byte b10) {
        zzf.zza((Object) bArr, zzi + j4, b10);
    }

    public static void zza(Object obj, long j4, double d10) {
        zzf.zza(obj, j4, d10);
    }

    public static void zza(Object obj, long j4, float f10) {
        zzf.zza(obj, j4, f10);
    }

    public static void zza(Object obj, long j4, int i10) {
        zzf.zza(obj, j4, i10);
    }

    public static boolean zzd() {
        return zzg;
    }

    public static void zza(Object obj, long j4, long j10) {
        zzf.zza(obj, j4, j10);
    }

    public static void zza(Object obj, long j4, Object obj2) {
        zzf.zza.putObject(obj, j4, obj2);
    }
}
