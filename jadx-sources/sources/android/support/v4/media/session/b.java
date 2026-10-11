package android.support.v4.media.session;

import android.media.session.MediaSessionManager;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.SystemClock;
import android.support.v4.media.MediaMetadataCompat;
import android.text.TextUtils;
import defpackage.ht2;
import defpackage.lt2;
import defpackage.nt3;
import defpackage.p65;
import defpackage.ze0;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class b extends Binder implements lt2 {
    public static final /* synthetic */ int f = 0;
    public final AtomicReference e;

    public b(nt3 nt3Var) {
        attachInterface(this, "android.support.v4.media.session.IMediaSession");
        this.e = new AtomicReference(nt3Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v3, types: [ft2, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v8, types: [ft2, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v2, types: [yu3, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, av3] */
    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        long j;
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
        }
        if (i == 1598968902) {
            parcel2.writeString("android.support.v4.media.session.IMediaSession");
            return true;
        }
        ht2 ht2Var = null;
        PlaybackStateCompat playbackStateCompat = null;
        ht2 ht2Var2 = null;
        int i3 = -1;
        switch (i) {
            case 1:
                parcel.readString();
                p65.o();
                return false;
            case 2:
                p65.o();
                return false;
            case 3:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("android.support.v4.media.session.IMediaControllerCallback");
                    if (queryLocalInterface != null && (queryLocalInterface instanceof ht2)) {
                        ht2Var = (ht2) queryLocalInterface;
                    } else {
                        ?? obj = new Object();
                        obj.e = readStrongBinder;
                        ht2Var = obj;
                    }
                }
                nt3 nt3Var = (nt3) this.e.get();
                if (nt3Var != null) {
                    int callingPid = Binder.getCallingPid();
                    int callingUid = Binder.getCallingUid();
                    ?? obj2 = new Object();
                    if (!TextUtils.isEmpty("android.media.session.MediaController")) {
                        ?? obj3 = new Object();
                        obj3.a = callingPid;
                        obj3.b = callingUid;
                        new MediaSessionManager.RemoteUserInfo("android.media.session.MediaController", callingPid, callingUid);
                        obj2.a = obj3;
                        nt3Var.e.register(ht2Var, obj2);
                        synchronized (nt3Var.d) {
                        }
                    } else {
                        ze0.k("packageName should be nonempty");
                        return false;
                    }
                }
                parcel2.writeNoException();
                return true;
            case 4:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("android.support.v4.media.session.IMediaControllerCallback");
                    if (queryLocalInterface2 != null && (queryLocalInterface2 instanceof ht2)) {
                        ht2Var2 = (ht2) queryLocalInterface2;
                    } else {
                        ?? obj4 = new Object();
                        obj4.e = readStrongBinder2;
                        ht2Var2 = obj4;
                    }
                }
                nt3 nt3Var2 = (nt3) this.e.get();
                if (nt3Var2 != null) {
                    nt3Var2.e.unregister(ht2Var2);
                    Binder.getCallingPid();
                    Binder.getCallingUid();
                    synchronized (nt3Var2.d) {
                    }
                }
                parcel2.writeNoException();
                return true;
            case 5:
                p65.o();
                return false;
            case 6:
                p65.o();
                return false;
            case 7:
                p65.o();
                return false;
            case 8:
                p65.o();
                return false;
            case 9:
                p65.o();
                return false;
            case 10:
                p65.o();
                return false;
            case 11:
                parcel.readInt();
                parcel.readInt();
                parcel.readString();
                p65.o();
                return false;
            case 12:
                parcel.readInt();
                parcel.readInt();
                parcel.readString();
                p65.o();
                return false;
            case 13:
                p65.o();
                return false;
            case 14:
                parcel.readString();
                p65.o();
                return false;
            case 15:
                parcel.readString();
                p65.o();
                return false;
            case 16:
                p65.o();
                return false;
            case 17:
                parcel.readLong();
                p65.o();
                return false;
            case 18:
                p65.o();
                return false;
            case 19:
                p65.o();
                return false;
            case 20:
                p65.o();
                return false;
            case 21:
                p65.o();
                return false;
            case 22:
                p65.o();
                return false;
            case 23:
                p65.o();
                return false;
            case 24:
                parcel.readLong();
                p65.o();
                return false;
            case 25:
                p65.o();
                return false;
            case 26:
                parcel.readString();
                p65.o();
                return false;
            case 27:
                p65.o();
                return false;
            case 28:
                nt3 nt3Var3 = (nt3) this.e.get();
                if (nt3Var3 != null) {
                    playbackStateCompat = nt3Var3.f;
                    MediaMetadataCompat mediaMetadataCompat = nt3Var3.g;
                    if (playbackStateCompat != null) {
                        float f2 = playbackStateCompat.A;
                        long j2 = playbackStateCompat.E;
                        int i4 = playbackStateCompat.x;
                        long j3 = playbackStateCompat.y;
                        long j4 = -1;
                        if (j3 != -1 && ((i4 == 3 || i4 == 4 || i4 == 5) && j2 > 0)) {
                            long elapsedRealtime = SystemClock.elapsedRealtime();
                            long j5 = (f2 * ((float) (elapsedRealtime - j2))) + j3;
                            if (mediaMetadataCompat != null) {
                                Bundle bundle = mediaMetadataCompat.x;
                                if (bundle.containsKey("android.media.metadata.DURATION")) {
                                    j4 = bundle.getLong("android.media.metadata.DURATION", 0L);
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
                            long j6 = playbackStateCompat.z;
                            long j7 = playbackStateCompat.B;
                            int i5 = playbackStateCompat.C;
                            CharSequence charSequence = playbackStateCompat.D;
                            ArrayList arrayList2 = playbackStateCompat.F;
                            if (arrayList2 != null) {
                                arrayList.addAll(arrayList2);
                            }
                            playbackStateCompat = new PlaybackStateCompat(playbackStateCompat.x, j, j6, playbackStateCompat.A, j7, i5, charSequence, elapsedRealtime, arrayList, playbackStateCompat.G, playbackStateCompat.H);
                        }
                    }
                }
                parcel2.writeNoException();
                if (playbackStateCompat != null) {
                    parcel2.writeInt(1);
                    playbackStateCompat.writeToParcel(parcel2, 1);
                    return true;
                }
                parcel2.writeInt(0);
                return true;
            case 29:
                parcel2.writeNoException();
                parcel2.writeInt(-1);
                return true;
            case 30:
                p65.o();
                return false;
            case 31:
                p65.o();
                return false;
            case 32:
                parcel2.writeNoException();
                parcel2.writeInt(0);
                return true;
            case 33:
                p65.o();
                return false;
            case 34:
                parcel.readString();
                p65.o();
                return false;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_FAILURE_TIME_VALUE:
                parcel.readString();
                p65.o();
                return false;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_WV_STARTED_VALUE:
                p65.o();
                return false;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_CLICKED_VALUE:
                if (((nt3) this.e.get()) != null) {
                    i3 = 0;
                }
                parcel2.writeNoException();
                parcel2.writeInt(i3);
                return true;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_LEFT_APP_VALUE:
                parcel2.writeNoException();
                parcel2.writeInt(0);
                return true;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_STARTED_AD_VIEWER_VALUE:
                parcel.readInt();
                p65.o();
                return false;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_REWARDED_VALUE:
                parcel.readInt();
                parcel2.writeNoException();
                return true;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_OPERATIVE_EVENT_SENT_VALUE:
                p65.o();
                return false;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_SAVED_OPERATIVE_EVENT_SENT_VALUE:
                parcel.readInt();
                p65.o();
                return false;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_OPERATIVE_EVENT_FAILURE_VALUE:
                p65.o();
                return false;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_TRANSACTION_SUCCESS_TIME_VALUE:
                parcel.readInt();
                p65.o();
                return false;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_TRANSACTION_FAILURE_TIME_VALUE:
                parcel2.writeNoException();
                parcel2.writeInt(0);
                return true;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_NETWORK_VALUE:
                parcel.readInt();
                p65.o();
                return false;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_EXTRAS_EXCEEDED_SIZE_VALUE:
                if (((nt3) this.e.get()) != null) {
                    i3 = 0;
                }
                parcel2.writeNoException();
                parcel2.writeInt(i3);
                return true;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE:
                parcel.readInt();
                p65.o();
                return false;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_SUCCESS_TIME_VALUE:
                parcel.readFloat();
                p65.o();
                return false;
            case 50:
                ((nt3) this.e.get()).getClass();
                parcel2.writeNoException();
                parcel2.writeInt(0);
                return true;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SUBSCRIPTION_STARTED_VALUE:
                p65.o();
                return false;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
