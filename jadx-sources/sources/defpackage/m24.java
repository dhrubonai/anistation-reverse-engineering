package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import androidx.room.MultiInstanceInvalidationService;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class m24 extends Binder implements pt2 {
    public static final /* synthetic */ int f = 0;
    public final /* synthetic */ MultiInstanceInvalidationService e;

    public m24(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.e = multiInstanceInvalidationService;
        attachInterface(this, pt2.b);
    }

    @Override // defpackage.pt2
    public final void D(nt2 nt2Var, int i) {
        nt2Var.getClass();
        MultiInstanceInvalidationService multiInstanceInvalidationService = this.e;
        synchronized (multiInstanceInvalidationService.z) {
            multiInstanceInvalidationService.z.unregister(nt2Var);
        }
    }

    @Override // defpackage.pt2
    public final void H(int i, String[] strArr) {
        strArr.getClass();
        MultiInstanceInvalidationService multiInstanceInvalidationService = this.e;
        synchronized (multiInstanceInvalidationService.z) {
            String str = (String) multiInstanceInvalidationService.y.get(Integer.valueOf(i));
            if (str == null) {
                Log.w("ROOM", "Remote invalidation client ID not registered");
                return;
            }
            int beginBroadcast = multiInstanceInvalidationService.z.beginBroadcast();
            int i2 = 0;
            while (true) {
                n24 n24Var = multiInstanceInvalidationService.z;
                if (i2 < beginBroadcast) {
                    try {
                        Object broadcastCookie = n24Var.getBroadcastCookie(i2);
                        broadcastCookie.getClass();
                        Integer num = (Integer) broadcastCookie;
                        int intValue = num.intValue();
                        String str2 = (String) multiInstanceInvalidationService.y.get(num);
                        if (i != intValue && str.equals(str2)) {
                            try {
                                ((nt2) multiInstanceInvalidationService.z.getBroadcastItem(i2)).k(strArr);
                            } catch (RemoteException e) {
                                Log.w("ROOM", "Error invoking a remote callback", e);
                            }
                        }
                        i2++;
                    } catch (Throwable th) {
                        multiInstanceInvalidationService.z.finishBroadcast();
                        throw th;
                    }
                } else {
                    n24Var.finishBroadcast();
                    return;
                }
            }
        }
    }

    @Override // defpackage.pt2
    public final int o(nt2 nt2Var, String str) {
        nt2Var.getClass();
        int i = 0;
        if (str == null) {
            return 0;
        }
        MultiInstanceInvalidationService multiInstanceInvalidationService = this.e;
        synchronized (multiInstanceInvalidationService.z) {
            try {
                int i2 = multiInstanceInvalidationService.x + 1;
                multiInstanceInvalidationService.x = i2;
                if (multiInstanceInvalidationService.z.register(nt2Var, Integer.valueOf(i2))) {
                    multiInstanceInvalidationService.y.put(Integer.valueOf(i2), str);
                    i = i2;
                } else {
                    multiInstanceInvalidationService.x--;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return i;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, mt2] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, mt2] */
    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        String str = pt2.b;
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (i == 1598968902) {
            parcel2.writeString(str);
            return true;
        }
        nt2 nt2Var = null;
        nt2 nt2Var2 = null;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                H(parcel.readInt(), parcel.createStringArray());
                return true;
            }
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface(nt2.a);
                if (queryLocalInterface != null && (queryLocalInterface instanceof nt2)) {
                    nt2Var2 = (nt2) queryLocalInterface;
                } else {
                    ?? obj = new Object();
                    obj.e = readStrongBinder;
                    nt2Var2 = obj;
                }
            }
            D(nt2Var2, parcel.readInt());
            parcel2.writeNoException();
            return true;
        }
        IBinder readStrongBinder2 = parcel.readStrongBinder();
        if (readStrongBinder2 != null) {
            IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface(nt2.a);
            if (queryLocalInterface2 != null && (queryLocalInterface2 instanceof nt2)) {
                nt2Var = (nt2) queryLocalInterface2;
            } else {
                ?? obj2 = new Object();
                obj2.e = readStrongBinder2;
                nt2Var = obj2;
            }
        }
        int o = o(nt2Var, parcel.readString());
        parcel2.writeNoException();
        parcel2.writeInt(o);
        return true;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
