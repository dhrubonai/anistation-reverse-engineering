package defpackage;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.SystemClock;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class lt3 extends Binder implements kt2 {
    public static final /* synthetic */ int f = 0;
    public final WeakReference e;

    public lt3(mt3 mt3Var) {
        attachInterface(this, "android.support.v4.media.session.IMediaSession");
        this.e = new WeakReference(mt3Var);
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [et2, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v6, types: [et2, java.lang.Object] */
    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        long j;
        Bundle bundle;
        gt2 gt2Var = null;
        r5 = null;
        Bundle bundle2 = null;
        wn4 wn4Var = null;
        gt2 gt2Var2 = null;
        if (i != 3) {
            if (i != 4) {
                if (i != 28) {
                    int i3 = -1;
                    if (i != 37) {
                        if (i != 45) {
                            if (i != 47) {
                                if (i != 50) {
                                    if (i != 1598968902) {
                                        return super.onTransact(i, parcel, parcel2, i2);
                                    }
                                    parcel2.getClass();
                                    parcel2.writeString("android.support.v4.media.session.IMediaSession");
                                    return true;
                                }
                                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                                mt3 mt3Var = (mt3) this.e.get();
                                if (mt3Var != null && (bundle = mt3Var.e) != null) {
                                    bundle2 = new Bundle(bundle);
                                }
                                parcel2.getClass();
                                parcel2.writeNoException();
                                if (bundle2 != null) {
                                    parcel2.writeInt(1);
                                    bundle2.writeToParcel(parcel2, 1);
                                    return true;
                                }
                                parcel2.writeInt(0);
                                return true;
                            }
                            parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                            mt3 mt3Var2 = (mt3) this.e.get();
                            if (mt3Var2 != null) {
                                i3 = mt3Var2.k;
                            }
                            parcel2.getClass();
                            parcel2.writeNoException();
                            parcel2.writeInt(i3);
                            return true;
                        }
                        parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                        parcel2.getClass();
                        parcel2.writeNoException();
                        parcel2.writeInt(0);
                        return true;
                    }
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    mt3 mt3Var3 = (mt3) this.e.get();
                    if (mt3Var3 != null) {
                        i3 = mt3Var3.j;
                    }
                    parcel2.getClass();
                    parcel2.writeNoException();
                    parcel2.writeInt(i3);
                    return true;
                }
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                mt3 mt3Var4 = (mt3) this.e.get();
                if (mt3Var4 != null) {
                    wn4Var = mt3Var4.g;
                    kr3 kr3Var = mt3Var4.i;
                    if (wn4Var != null) {
                        float f2 = wn4Var.A;
                        long j2 = wn4Var.E;
                        int i4 = wn4Var.x;
                        long j3 = wn4Var.y;
                        long j4 = -1;
                        if (j3 != -1 && ((i4 == 3 || i4 == 4 || i4 == 5) && j2 > 0)) {
                            long elapsedRealtime = SystemClock.elapsedRealtime();
                            long j5 = (f2 * ((float) (elapsedRealtime - j2))) + j3;
                            if (kr3Var != null) {
                                Bundle bundle3 = kr3Var.x;
                                if (bundle3.containsKey("android.media.metadata.DURATION")) {
                                    j4 = bundle3.getLong("android.media.metadata.DURATION", 0L);
                                }
                            }
                            if (j4 >= 0 && j5 > j4) {
                                j = j4;
                            } else if (j5 < 0) {
                                j = 0;
                            } else {
                                j = j5;
                            }
                            ArrayList arrayList = new ArrayList();
                            long j6 = wn4Var.z;
                            long j7 = wn4Var.B;
                            int i5 = wn4Var.C;
                            CharSequence charSequence = wn4Var.D;
                            List list = wn4Var.F;
                            if (list != null) {
                                arrayList.addAll(list);
                            }
                            wn4Var = new wn4(wn4Var.x, j, j6, wn4Var.A, j7, i5, charSequence, elapsedRealtime, arrayList, wn4Var.G, wn4Var.H);
                        }
                    }
                }
                parcel2.getClass();
                parcel2.writeNoException();
                if (wn4Var != null) {
                    parcel2.writeInt(1);
                    wn4Var.writeToParcel(parcel2, 1);
                    return true;
                }
                parcel2.writeInt(0);
                return true;
            }
            parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("android.support.v4.media.session.IMediaControllerCallback");
                if (queryLocalInterface != null && (queryLocalInterface instanceof gt2)) {
                    gt2Var2 = (gt2) queryLocalInterface;
                } else {
                    ?? obj = new Object();
                    obj.e = readStrongBinder;
                    gt2Var2 = obj;
                }
            }
            mt3 mt3Var5 = (mt3) this.e.get();
            if (mt3Var5 != null && gt2Var2 != null) {
                mt3Var5.f.unregister(gt2Var2);
                Binder.getCallingPid();
                Binder.getCallingUid();
                synchronized (mt3Var5.d) {
                }
            }
            parcel2.getClass();
            parcel2.writeNoException();
            return true;
        }
        parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
        IBinder readStrongBinder2 = parcel.readStrongBinder();
        if (readStrongBinder2 != null) {
            IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("android.support.v4.media.session.IMediaControllerCallback");
            if (queryLocalInterface2 != null && (queryLocalInterface2 instanceof gt2)) {
                gt2Var = (gt2) queryLocalInterface2;
            } else {
                ?? obj2 = new Object();
                obj2.e = readStrongBinder2;
                gt2Var = obj2;
            }
        }
        mt3 mt3Var6 = (mt3) this.e.get();
        if (mt3Var6 != null && gt2Var != null) {
            mt3Var6.f.register(gt2Var, new xu3("android.media.session.MediaController", Binder.getCallingPid(), Binder.getCallingUid()));
            synchronized (mt3Var6.d) {
            }
        }
        parcel2.getClass();
        parcel2.writeNoException();
        return true;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
