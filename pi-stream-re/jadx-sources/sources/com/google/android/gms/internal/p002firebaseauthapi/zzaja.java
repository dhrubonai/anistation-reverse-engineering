package com.google.android.gms.internal.p002firebaseauthapi;

import a3.g;
import com.google.android.gms.common.api.f;
import com.google.android.gms.internal.firebase-auth-api.zzaja.zzb;
import com.google.android.gms.internal.p002firebaseauthapi.zzaja;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public abstract class zzaja<MessageType extends zzaja<MessageType, BuilderType>, BuilderType extends zzb<MessageType, BuilderType>> extends zzahd<MessageType, BuilderType> {
    private static Map<Object, zzaja<?, ?>> zzc = new ConcurrentHashMap();
    private int zzd = -1;
    protected zzame zzb = zzame.zzc();

    /* loaded from: classes.dex */
    public static class zza<T extends zzaja<T, ?>> extends zzahh<T> {
        private final T zza;

        public zza(T t9) {
            this.zza = t9;
        }
    }

    /* loaded from: classes.dex */
    public static final class zzc implements zzaiu<zzc> {
        @Override // java.lang.Comparable
        public final /* synthetic */ int compareTo(Object obj) {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaiu
        public final int zza() {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaiu
        public final zzamo zzb() {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaiu
        public final zzamy zzc() {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaiu
        public final boolean zzd() {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaiu
        public final boolean zze() {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaiu
        public final zzakn zza(zzakn zzaknVar, zzakk zzakkVar) {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaiu
        public final zzakt zza(zzakt zzaktVar, zzakt zzaktVar2) {
            throw new NoSuchMethodError();
        }
    }

    /* loaded from: classes.dex */
    public static abstract class zzd<MessageType extends zzd<MessageType, BuilderType>, BuilderType> extends zzaja<MessageType, BuilderType> implements zzakm {
        protected zzais<zzc> zzc = zzais.zzb();

        public final zzais<zzc> zza() {
            if (this.zzc.zzf()) {
                this.zzc = (zzais) this.zzc.clone();
            }
            return this.zzc;
        }
    }

    /* loaded from: classes.dex */
    public enum zze {
        public static final int zza = 1;
        public static final int zzb = 2;
        public static final int zzc = 3;
        public static final int zzd = 4;
        public static final int zze = 5;
        public static final int zzf = 6;
        public static final int zzg = 7;
        private static final /* synthetic */ int[] zzh = {1, 2, 3, 4, 5, 6, 7};

        public static int[] zza() {
            return (int[]) zzh.clone();
        }
    }

    /* loaded from: classes.dex */
    public static class zzf<ContainingType extends zzakk, Type> extends zzaim<ContainingType, Type> {
    }

    private final int zza() {
        return zzaky.zza().zza((zzaky) this).zzb(this);
    }

    private final int zzb(zzalc<?> zzalcVar) {
        if (zzalcVar == null) {
            return zzaky.zza().zza((zzaky) this).zza(this);
        }
        return zzalcVar.zza(this);
    }

    public static <E> zzajg<E> zzo() {
        return zzalb.zzd();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return zzaky.zza().zza((zzaky) this).zzb(this, (zzaja) obj);
    }

    public int hashCode() {
        if (zzv()) {
            return zza();
        }
        if (this.zza == 0) {
            this.zza = zza();
        }
        return this.zza;
    }

    public String toString() {
        return zzakp.zza(this, super.toString());
    }

    public abstract Object zza(int i10, Object obj, Object obj2);

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzahd
    public final int zzh() {
        return this.zzd & f.API_PRIORITY_OTHER;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakk
    public final int zzk() {
        return zza((zzalc) null);
    }

    public final <MessageType extends zzaja<MessageType, BuilderType>, BuilderType extends zzb<MessageType, BuilderType>> BuilderType zzl() {
        return (BuilderType) zza(zze.zze, (Object) null, (Object) null);
    }

    public final BuilderType zzm() {
        return (BuilderType) ((zzb) zza(zze.zze, (Object) null, (Object) null)).zza(this);
    }

    public final MessageType zzn() {
        return (MessageType) zza(zze.zzd, (Object) null, (Object) null);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakk
    public final /* synthetic */ zzakn zzp() {
        return (zzb) zza(zze.zze, (Object) null, (Object) null);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakk
    public final /* synthetic */ zzakn zzq() {
        return ((zzb) zza(zze.zze, (Object) null, (Object) null)).zza(this);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakm
    public final /* synthetic */ zzakk zzr() {
        return (zzaja) zza(zze.zzf, (Object) null, (Object) null);
    }

    public final void zzs() {
        zzaky.zza().zza((zzaky) this).zzc(this);
        zzt();
    }

    public final void zzt() {
        this.zzd &= f.API_PRIORITY_OTHER;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakm
    public final boolean zzu() {
        return zza(this, true);
    }

    public final boolean zzv() {
        if ((this.zzd & Integer.MIN_VALUE) != 0) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzahd
    public final int zza(zzalc zzalcVar) {
        if (zzv()) {
            int zzb2 = zzb((zzalc<?>) zzalcVar);
            if (zzb2 >= 0) {
                return zzb2;
            }
            throw new IllegalStateException(g.n("serialized size must be non-negative, was ", zzb2));
        }
        if (zzh() != Integer.MAX_VALUE) {
            return zzh();
        }
        int zzb3 = zzb((zzalc<?>) zzalcVar);
        zzb(zzb3);
        return zzb3;
    }

    private static <T extends zzaja<T, ?>> T zzb(T t9, zzahm zzahmVar, zzaip zzaipVar) {
        zzaib zzc2 = zzahmVar.zzc();
        T t10 = (T) zza(t9, zzc2, zzaipVar);
        try {
            zzc2.zzb(0);
            return t10;
        } catch (zzajj e10) {
            throw e10.zza(t10);
        }
    }

    /* loaded from: classes.dex */
    public static abstract class zzb<MessageType extends zzaja<MessageType, BuilderType>, BuilderType extends zzb<MessageType, BuilderType>> extends zzahf<MessageType, BuilderType> {
        protected MessageType zza;
        private final MessageType zzb;

        public zzb(MessageType messagetype) {
            this.zzb = messagetype;
            if (!messagetype.zzv()) {
                this.zza = (MessageType) messagetype.zzn();
                return;
            }
            throw new IllegalArgumentException("Default instance must be immutable.");
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzahf
        public /* synthetic */ Object clone() {
            zzb zzbVar = (zzb) this.zzb.zza(zze.zze, null, null);
            zzbVar.zza = (MessageType) zzg();
            return zzbVar;
        }

        public final BuilderType zza(MessageType messagetype) {
            if (this.zzb.equals(messagetype)) {
                return this;
            }
            if (!this.zza.zzv()) {
                zzi();
            }
            zza(this.zza, messagetype);
            return this;
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzahf
        /* renamed from: zzc */
        public final /* synthetic */ zzahf clone() {
            return (zzb) clone();
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakn
        /* renamed from: zzd, reason: merged with bridge method [inline-methods] */
        public final MessageType zzf() {
            MessageType messagetype = (MessageType) zzg();
            if (messagetype.zzu()) {
                return messagetype;
            }
            throw new zzamc(messagetype);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakn
        /* renamed from: zze, reason: merged with bridge method [inline-methods] */
        public MessageType zzg() {
            if (!this.zza.zzv()) {
                return this.zza;
            }
            this.zza.zzs();
            return this.zza;
        }

        public final void zzh() {
            if (!this.zza.zzv()) {
                zzi();
            }
        }

        public void zzi() {
            MessageType messagetype = (MessageType) this.zzb.zzn();
            zza(messagetype, this.zza);
            this.zza = messagetype;
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakm
        public final /* synthetic */ zzakk zzr() {
            return this.zzb;
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakm
        public final boolean zzu() {
            return zzaja.zza(this.zza, false);
        }

        private static <MessageType> void zza(MessageType messagetype, MessageType messagetype2) {
            zzaky.zza().zza((zzaky) messagetype).zza(messagetype, messagetype2);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzahd
    public final void zzb(int i10) {
        if (i10 >= 0) {
            this.zzd = (i10 & f.API_PRIORITY_OTHER) | (this.zzd & Integer.MIN_VALUE);
            return;
        }
        throw new IllegalStateException(g.n("serialized size must be non-negative, was ", i10));
    }

    private static <T extends zzaja<T, ?>> T zza(T t9) {
        if (t9 == null || t9.zzu()) {
            return t9;
        }
        throw new zzamc(t9).zza().zza(t9);
    }

    public static <T extends zzaja<?, ?>> T zza(Class<T> cls) {
        zzaja<?, ?> zzajaVar = zzc.get(cls);
        if (zzajaVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                zzajaVar = zzc.get(cls);
            } catch (ClassNotFoundException e10) {
                throw new IllegalStateException("Class initialization cannot fail.", e10);
            }
        }
        if (zzajaVar == null) {
            zzajaVar = (T) ((zzaja) zzamh.zza(cls)).zza(zze.zzf, (Object) null, (Object) null);
            if (zzajaVar != null) {
                zzc.put(cls, zzajaVar);
            } else {
                throw new IllegalStateException();
            }
        }
        return (T) zzajaVar;
    }

    public static <T extends zzaja<T, ?>> T zza(T t9, zzahm zzahmVar, zzaip zzaipVar) {
        return (T) zza(zzb(t9, zzahmVar, zzaipVar));
    }

    public static <T extends zzaja<T, ?>> T zza(T t9, InputStream inputStream, zzaip zzaipVar) {
        zzaib zzaicVar;
        if (inputStream == null) {
            byte[] bArr = zzajc.zzb;
            zzaicVar = zzaib.zza(bArr, 0, bArr.length, false);
        } else {
            zzaicVar = new zzaic(inputStream);
        }
        return (T) zza(zza(t9, zzaicVar, zzaipVar));
    }

    public static <T extends zzaja<T, ?>> T zza(T t9, byte[] bArr, zzaip zzaipVar) {
        return (T) zza(zza(t9, bArr, 0, bArr.length, zzaipVar));
    }

    private static <T extends zzaja<T, ?>> T zza(T t9, zzaib zzaibVar, zzaip zzaipVar) {
        T t10 = (T) t9.zzn();
        try {
            zzalc zza2 = zzaky.zza().zza((zzaky) t10);
            zza2.zza(t10, zzaig.zza(zzaibVar), zzaipVar);
            zza2.zzc(t10);
            return t10;
        } catch (zzajj e10) {
            e = e10;
            if (e.zzk()) {
                e = new zzajj(e);
            }
            throw e.zza(t10);
        } catch (zzamc e11) {
            throw e11.zza().zza(t10);
        } catch (IOException e12) {
            if (e12.getCause() instanceof zzajj) {
                throw ((zzajj) e12.getCause());
            }
            throw new zzajj(e12).zza(t10);
        } catch (RuntimeException e13) {
            if (e13.getCause() instanceof zzajj) {
                throw ((zzajj) e13.getCause());
            }
            throw e13;
        }
    }

    private static <T extends zzaja<T, ?>> T zza(T t9, byte[] bArr, int i10, int i11, zzaip zzaipVar) {
        T t10 = (T) t9.zzn();
        try {
            zzalc zza2 = zzaky.zza().zza((zzaky) t10);
            zza2.zza(t10, bArr, 0, i11, new zzahl(zzaipVar));
            zza2.zzc(t10);
            return t10;
        } catch (zzajj e10) {
            e = e10;
            if (e.zzk()) {
                e = new zzajj(e);
            }
            throw e.zza(t10);
        } catch (zzamc e11) {
            throw e11.zza().zza(t10);
        } catch (IOException e12) {
            if (e12.getCause() instanceof zzajj) {
                throw ((zzajj) e12.getCause());
            }
            throw new zzajj(e12).zza(t10);
        } catch (IndexOutOfBoundsException unused) {
            throw zzajj.zzi().zza(t10);
        }
    }

    public static <E> zzajg<E> zza(zzajg<E> zzajgVar) {
        int size = zzajgVar.size();
        return zzajgVar.zza(size == 0 ? 10 : size << 1);
    }

    public static Object zza(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e10) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e10);
        } catch (InvocationTargetException e11) {
            Throwable cause = e11.getCause();
            if (!(cause instanceof RuntimeException)) {
                if (cause instanceof Error) {
                    throw ((Error) cause);
                }
                throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
            }
            throw ((RuntimeException) cause);
        }
    }

    public static Object zza(zzakk zzakkVar, String str, Object[] objArr) {
        return new zzala(zzakkVar, str, objArr);
    }

    public static <T extends zzaja<?, ?>> void zza(Class<T> cls, T t9) {
        t9.zzt();
        zzc.put(cls, t9);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakk
    public final void zza(zzaii zzaiiVar) {
        zzaky.zza().zza((zzaky) this).zza((zzalc) this, (zzanb) zzaik.zza(zzaiiVar));
    }

    public static final <T extends zzaja<T, ?>> boolean zza(T t9, boolean z9) {
        byte byteValue = ((Byte) t9.zza(zze.zza, null, null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean zzd2 = zzaky.zza().zza((zzaky) t9).zzd(t9);
        if (z9) {
            t9.zza(zze.zzb, zzd2 ? t9 : null, null);
        }
        return zzd2;
    }
}
