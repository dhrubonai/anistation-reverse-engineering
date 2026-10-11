package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.HashMap;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class vn7 extends rm7 implements wn7 {
    /* JADX WARN: Type inference failed for: r1v1, types: [wn7, sa7] */
    public static wn7 asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
        if (queryLocalInterface instanceof wn7) {
            return (wn7) queryLocalInterface;
        }
        return new sa7(iBinder, "com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService", (byte) 3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v28, types: [sa7] */
    /* JADX WARN: Type inference failed for: r6v84, types: [sa7] */
    @Override // defpackage.rm7
    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9 = false;
        bo7 bo7Var = null;
        eo7 eo7Var = null;
        bo7 bo7Var2 = null;
        bo7 bo7Var3 = null;
        bo7 bo7Var4 = null;
        bo7 bo7Var5 = null;
        go7 go7Var = null;
        go7 go7Var2 = null;
        go7 go7Var3 = null;
        bo7 bo7Var6 = null;
        bo7 bo7Var7 = null;
        bo7 bo7Var8 = null;
        bo7 bo7Var9 = null;
        bo7 bo7Var10 = null;
        bo7 bo7Var11 = null;
        ro7 ro7Var = null;
        bo7 bo7Var12 = null;
        bo7 bo7Var13 = null;
        bo7 bo7Var14 = null;
        bo7 bo7Var15 = null;
        bo7 bo7Var16 = null;
        switch (i) {
            case 1:
                tt2 L = ic4.L(parcel.readStrongBinder());
                so7 so7Var = (so7) tm7.a(parcel, so7.CREATOR);
                long readLong = parcel.readLong();
                tm7.d(parcel);
                initialize(L, so7Var, readLong);
                break;
            case 2:
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                Bundle bundle = (Bundle) tm7.a(parcel, Bundle.CREATOR);
                if (parcel.readInt() != 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (parcel.readInt() != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                long readLong2 = parcel.readLong();
                tm7.d(parcel);
                logEvent(readString, readString2, bundle, z, z2, readLong2);
                break;
            case 3:
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                Bundle bundle2 = (Bundle) tm7.a(parcel, Bundle.CREATOR);
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface instanceof bo7) {
                        bo7Var = (bo7) queryLocalInterface;
                    } else {
                        bo7Var = new yn7(readStrongBinder);
                    }
                }
                bo7 bo7Var17 = bo7Var;
                long readLong3 = parcel.readLong();
                tm7.d(parcel);
                logEventAndBundle(readString3, readString4, bundle2, bo7Var17, readLong3);
                break;
            case 4:
                String readString5 = parcel.readString();
                String readString6 = parcel.readString();
                tt2 L2 = ic4.L(parcel.readStrongBinder());
                ClassLoader classLoader = tm7.a;
                if (parcel.readInt() != 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                long readLong4 = parcel.readLong();
                tm7.d(parcel);
                setUserProperty(readString5, readString6, L2, z3, readLong4);
                break;
            case 5:
                String readString7 = parcel.readString();
                String readString8 = parcel.readString();
                ClassLoader classLoader2 = tm7.a;
                if (parcel.readInt() != 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface2 instanceof bo7) {
                        bo7Var16 = (bo7) queryLocalInterface2;
                    } else {
                        bo7Var16 = new yn7(readStrongBinder2);
                    }
                }
                tm7.d(parcel);
                getUserProperties(readString7, readString8, z4, bo7Var16);
                break;
            case 6:
                String readString9 = parcel.readString();
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface3 instanceof bo7) {
                        bo7Var15 = (bo7) queryLocalInterface3;
                    } else {
                        bo7Var15 = new yn7(readStrongBinder3);
                    }
                }
                tm7.d(parcel);
                getMaxUserProperties(readString9, bo7Var15);
                break;
            case 7:
                String readString10 = parcel.readString();
                long readLong5 = parcel.readLong();
                tm7.d(parcel);
                setUserId(readString10, readLong5);
                break;
            case 8:
                Bundle bundle3 = (Bundle) tm7.a(parcel, Bundle.CREATOR);
                long readLong6 = parcel.readLong();
                tm7.d(parcel);
                setConditionalUserProperty(bundle3, readLong6);
                break;
            case 9:
                String readString11 = parcel.readString();
                String readString12 = parcel.readString();
                Bundle bundle4 = (Bundle) tm7.a(parcel, Bundle.CREATOR);
                tm7.d(parcel);
                clearConditionalUserProperty(readString11, readString12, bundle4);
                break;
            case 10:
                String readString13 = parcel.readString();
                String readString14 = parcel.readString();
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface4 instanceof bo7) {
                        bo7Var14 = (bo7) queryLocalInterface4;
                    } else {
                        bo7Var14 = new yn7(readStrongBinder4);
                    }
                }
                tm7.d(parcel);
                getConditionalUserProperties(readString13, readString14, bo7Var14);
                break;
            case 11:
                ClassLoader classLoader3 = tm7.a;
                if (parcel.readInt() != 0) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                long readLong7 = parcel.readLong();
                tm7.d(parcel);
                setMeasurementEnabled(z5, readLong7);
                break;
            case 12:
                long readLong8 = parcel.readLong();
                tm7.d(parcel);
                resetAnalyticsData(readLong8);
                break;
            case 13:
                long readLong9 = parcel.readLong();
                tm7.d(parcel);
                setMinimumSessionDuration(readLong9);
                break;
            case 14:
                long readLong10 = parcel.readLong();
                tm7.d(parcel);
                setSessionTimeoutDuration(readLong10);
                break;
            case 15:
                tt2 L3 = ic4.L(parcel.readStrongBinder());
                String readString15 = parcel.readString();
                String readString16 = parcel.readString();
                long readLong11 = parcel.readLong();
                tm7.d(parcel);
                setCurrentScreen(L3, readString15, readString16, readLong11);
                break;
            case 16:
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface5 instanceof bo7) {
                        bo7Var13 = (bo7) queryLocalInterface5;
                    } else {
                        bo7Var13 = new yn7(readStrongBinder5);
                    }
                }
                tm7.d(parcel);
                getCurrentScreenName(bo7Var13);
                break;
            case 17:
                IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 != null) {
                    IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface6 instanceof bo7) {
                        bo7Var12 = (bo7) queryLocalInterface6;
                    } else {
                        bo7Var12 = new yn7(readStrongBinder6);
                    }
                }
                tm7.d(parcel);
                getCurrentScreenClass(bo7Var12);
                break;
            case 18:
                IBinder readStrongBinder7 = parcel.readStrongBinder();
                if (readStrongBinder7 != null) {
                    IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.google.android.gms.measurement.api.internal.IStringProvider");
                    if (queryLocalInterface7 instanceof ro7) {
                        ro7Var = (ro7) queryLocalInterface7;
                    } else {
                        ro7Var = new sa7(readStrongBinder7, "com.google.android.gms.measurement.api.internal.IStringProvider", (byte) 3);
                    }
                }
                tm7.d(parcel);
                setInstanceIdProvider(ro7Var);
                break;
            case 19:
                IBinder readStrongBinder8 = parcel.readStrongBinder();
                if (readStrongBinder8 != null) {
                    IInterface queryLocalInterface8 = readStrongBinder8.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface8 instanceof bo7) {
                        bo7Var11 = (bo7) queryLocalInterface8;
                    } else {
                        bo7Var11 = new yn7(readStrongBinder8);
                    }
                }
                tm7.d(parcel);
                getCachedAppInstanceId(bo7Var11);
                break;
            case 20:
                IBinder readStrongBinder9 = parcel.readStrongBinder();
                if (readStrongBinder9 != null) {
                    IInterface queryLocalInterface9 = readStrongBinder9.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface9 instanceof bo7) {
                        bo7Var10 = (bo7) queryLocalInterface9;
                    } else {
                        bo7Var10 = new yn7(readStrongBinder9);
                    }
                }
                tm7.d(parcel);
                getAppInstanceId(bo7Var10);
                break;
            case 21:
                IBinder readStrongBinder10 = parcel.readStrongBinder();
                if (readStrongBinder10 != null) {
                    IInterface queryLocalInterface10 = readStrongBinder10.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface10 instanceof bo7) {
                        bo7Var9 = (bo7) queryLocalInterface10;
                    } else {
                        bo7Var9 = new yn7(readStrongBinder10);
                    }
                }
                tm7.d(parcel);
                getGmpAppId(bo7Var9);
                break;
            case 22:
                IBinder readStrongBinder11 = parcel.readStrongBinder();
                if (readStrongBinder11 != null) {
                    IInterface queryLocalInterface11 = readStrongBinder11.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface11 instanceof bo7) {
                        bo7Var8 = (bo7) queryLocalInterface11;
                    } else {
                        bo7Var8 = new yn7(readStrongBinder11);
                    }
                }
                tm7.d(parcel);
                generateEventId(bo7Var8);
                break;
            case 23:
                String readString17 = parcel.readString();
                long readLong12 = parcel.readLong();
                tm7.d(parcel);
                beginAdUnitExposure(readString17, readLong12);
                break;
            case 24:
                String readString18 = parcel.readString();
                long readLong13 = parcel.readLong();
                tm7.d(parcel);
                endAdUnitExposure(readString18, readLong13);
                break;
            case 25:
                tt2 L4 = ic4.L(parcel.readStrongBinder());
                long readLong14 = parcel.readLong();
                tm7.d(parcel);
                onActivityStarted(L4, readLong14);
                break;
            case 26:
                tt2 L5 = ic4.L(parcel.readStrongBinder());
                long readLong15 = parcel.readLong();
                tm7.d(parcel);
                onActivityStopped(L5, readLong15);
                break;
            case 27:
                tt2 L6 = ic4.L(parcel.readStrongBinder());
                Bundle bundle5 = (Bundle) tm7.a(parcel, Bundle.CREATOR);
                long readLong16 = parcel.readLong();
                tm7.d(parcel);
                onActivityCreated(L6, bundle5, readLong16);
                break;
            case 28:
                tt2 L7 = ic4.L(parcel.readStrongBinder());
                long readLong17 = parcel.readLong();
                tm7.d(parcel);
                onActivityDestroyed(L7, readLong17);
                break;
            case 29:
                tt2 L8 = ic4.L(parcel.readStrongBinder());
                long readLong18 = parcel.readLong();
                tm7.d(parcel);
                onActivityPaused(L8, readLong18);
                break;
            case 30:
                tt2 L9 = ic4.L(parcel.readStrongBinder());
                long readLong19 = parcel.readLong();
                tm7.d(parcel);
                onActivityResumed(L9, readLong19);
                break;
            case 31:
                tt2 L10 = ic4.L(parcel.readStrongBinder());
                IBinder readStrongBinder12 = parcel.readStrongBinder();
                if (readStrongBinder12 != null) {
                    IInterface queryLocalInterface12 = readStrongBinder12.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface12 instanceof bo7) {
                        bo7Var7 = (bo7) queryLocalInterface12;
                    } else {
                        bo7Var7 = new yn7(readStrongBinder12);
                    }
                }
                long readLong20 = parcel.readLong();
                tm7.d(parcel);
                onActivitySaveInstanceState(L10, bo7Var7, readLong20);
                break;
            case 32:
                Bundle bundle6 = (Bundle) tm7.a(parcel, Bundle.CREATOR);
                IBinder readStrongBinder13 = parcel.readStrongBinder();
                if (readStrongBinder13 != null) {
                    IInterface queryLocalInterface13 = readStrongBinder13.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface13 instanceof bo7) {
                        bo7Var6 = (bo7) queryLocalInterface13;
                    } else {
                        bo7Var6 = new yn7(readStrongBinder13);
                    }
                }
                long readLong21 = parcel.readLong();
                tm7.d(parcel);
                performAction(bundle6, bo7Var6, readLong21);
                break;
            case 33:
                int readInt = parcel.readInt();
                String readString19 = parcel.readString();
                tt2 L11 = ic4.L(parcel.readStrongBinder());
                tt2 L12 = ic4.L(parcel.readStrongBinder());
                tt2 L13 = ic4.L(parcel.readStrongBinder());
                tm7.d(parcel);
                logHealthData(readInt, readString19, L11, L12, L13);
                break;
            case 34:
                IBinder readStrongBinder14 = parcel.readStrongBinder();
                if (readStrongBinder14 != null) {
                    IInterface queryLocalInterface14 = readStrongBinder14.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    if (queryLocalInterface14 instanceof go7) {
                        go7Var3 = (go7) queryLocalInterface14;
                    } else {
                        go7Var3 = new fo7(readStrongBinder14);
                    }
                }
                tm7.d(parcel);
                setEventInterceptor(go7Var3);
                break;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_FAILURE_TIME_VALUE:
                IBinder readStrongBinder15 = parcel.readStrongBinder();
                if (readStrongBinder15 != null) {
                    IInterface queryLocalInterface15 = readStrongBinder15.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    if (queryLocalInterface15 instanceof go7) {
                        go7Var2 = (go7) queryLocalInterface15;
                    } else {
                        go7Var2 = new fo7(readStrongBinder15);
                    }
                }
                tm7.d(parcel);
                registerOnMeasurementEventListener(go7Var2);
                break;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_WV_STARTED_VALUE:
                IBinder readStrongBinder16 = parcel.readStrongBinder();
                if (readStrongBinder16 != null) {
                    IInterface queryLocalInterface16 = readStrongBinder16.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    if (queryLocalInterface16 instanceof go7) {
                        go7Var = (go7) queryLocalInterface16;
                    } else {
                        go7Var = new fo7(readStrongBinder16);
                    }
                }
                tm7.d(parcel);
                unregisterOnMeasurementEventListener(go7Var);
                break;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_CLICKED_VALUE:
                HashMap readHashMap = parcel.readHashMap(tm7.a);
                tm7.d(parcel);
                initForTests(readHashMap);
                break;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_LEFT_APP_VALUE:
                IBinder readStrongBinder17 = parcel.readStrongBinder();
                if (readStrongBinder17 != null) {
                    IInterface queryLocalInterface17 = readStrongBinder17.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface17 instanceof bo7) {
                        bo7Var5 = (bo7) queryLocalInterface17;
                    } else {
                        bo7Var5 = new yn7(readStrongBinder17);
                    }
                }
                int readInt2 = parcel.readInt();
                tm7.d(parcel);
                getTestFlag(bo7Var5, readInt2);
                break;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_STARTED_AD_VIEWER_VALUE:
                ClassLoader classLoader4 = tm7.a;
                if (parcel.readInt() != 0) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                tm7.d(parcel);
                setDataCollectionEnabled(z6);
                break;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_SHOW_REWARDED_VALUE:
                IBinder readStrongBinder18 = parcel.readStrongBinder();
                if (readStrongBinder18 != null) {
                    IInterface queryLocalInterface18 = readStrongBinder18.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface18 instanceof bo7) {
                        bo7Var4 = (bo7) queryLocalInterface18;
                    } else {
                        bo7Var4 = new yn7(readStrongBinder18);
                    }
                }
                tm7.d(parcel);
                isDataCollectionEnabled(bo7Var4);
                break;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_OPERATIVE_EVENT_SENT_VALUE:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_EXTRAS_EXCEEDED_SIZE_VALUE:
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_SUCCESS_TIME_VALUE:
            default:
                return false;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_SAVED_OPERATIVE_EVENT_SENT_VALUE:
                Bundle bundle7 = (Bundle) tm7.a(parcel, Bundle.CREATOR);
                tm7.d(parcel);
                setDefaultEventParameters(bundle7);
                break;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_OPERATIVE_EVENT_FAILURE_VALUE:
                long readLong22 = parcel.readLong();
                tm7.d(parcel);
                clearMeasurementEnabled(readLong22);
                break;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_TRANSACTION_SUCCESS_TIME_VALUE:
                Bundle bundle8 = (Bundle) tm7.a(parcel, Bundle.CREATOR);
                long readLong23 = parcel.readLong();
                tm7.d(parcel);
                setConsent(bundle8, readLong23);
                break;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_TRANSACTION_FAILURE_TIME_VALUE:
                Bundle bundle9 = (Bundle) tm7.a(parcel, Bundle.CREATOR);
                long readLong24 = parcel.readLong();
                tm7.d(parcel);
                setConsentThirdParty(bundle9, readLong24);
                break;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_NETWORK_VALUE:
                IBinder readStrongBinder19 = parcel.readStrongBinder();
                if (readStrongBinder19 != null) {
                    IInterface queryLocalInterface19 = readStrongBinder19.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface19 instanceof bo7) {
                        bo7Var3 = (bo7) queryLocalInterface19;
                    } else {
                        bo7Var3 = new yn7(readStrongBinder19);
                    }
                }
                tm7.d(parcel);
                getSessionId(bo7Var3);
                break;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE:
                Intent intent = (Intent) tm7.a(parcel, Intent.CREATOR);
                tm7.d(parcel);
                setSgtmDebugInfo(intent);
                break;
            case 50:
                to7 to7Var = (to7) tm7.a(parcel, to7.CREATOR);
                String readString20 = parcel.readString();
                String readString21 = parcel.readString();
                long readLong25 = parcel.readLong();
                tm7.d(parcel);
                setCurrentScreenByScionActivityInfo(to7Var, readString20, readString21, readLong25);
                break;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SUBSCRIPTION_STARTED_VALUE:
                to7 to7Var2 = (to7) tm7.a(parcel, to7.CREATOR);
                long readLong26 = parcel.readLong();
                tm7.d(parcel);
                onActivityStartedByScionActivityInfo(to7Var2, readLong26);
                break;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SUBSCRIPTION_SUCCESS_VALUE:
                to7 to7Var3 = (to7) tm7.a(parcel, to7.CREATOR);
                long readLong27 = parcel.readLong();
                tm7.d(parcel);
                onActivityStoppedByScionActivityInfo(to7Var3, readLong27);
                break;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SUBSCRIPTION_FAILURE_VALUE:
                to7 to7Var4 = (to7) tm7.a(parcel, to7.CREATOR);
                Bundle bundle10 = (Bundle) tm7.a(parcel, Bundle.CREATOR);
                long readLong28 = parcel.readLong();
                tm7.d(parcel);
                onActivityCreatedByScionActivityInfo(to7Var4, bundle10, readLong28);
                break;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SDK_NOT_FOUND_VALUE:
                to7 to7Var5 = (to7) tm7.a(parcel, to7.CREATOR);
                long readLong29 = parcel.readLong();
                tm7.d(parcel);
                onActivityDestroyedByScionActivityInfo(to7Var5, readLong29);
                break;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_UNSUBSCRIBED_VALUE:
                to7 to7Var6 = (to7) tm7.a(parcel, to7.CREATOR);
                long readLong30 = parcel.readLong();
                tm7.d(parcel);
                onActivityPausedByScionActivityInfo(to7Var6, readLong30);
                break;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_EVENT_RECEIVED_VALUE:
                to7 to7Var7 = (to7) tm7.a(parcel, to7.CREATOR);
                long readLong31 = parcel.readLong();
                tm7.d(parcel);
                onActivityResumedByScionActivityInfo(to7Var7, readLong31);
                break;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_EVENT_PARSE_FAILURE_VALUE:
                to7 to7Var8 = (to7) tm7.a(parcel, to7.CREATOR);
                IBinder readStrongBinder20 = parcel.readStrongBinder();
                if (readStrongBinder20 != null) {
                    IInterface queryLocalInterface20 = readStrongBinder20.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface20 instanceof bo7) {
                        bo7Var2 = (bo7) queryLocalInterface20;
                    } else {
                        bo7Var2 = new yn7(readStrongBinder20);
                    }
                }
                long readLong32 = parcel.readLong();
                tm7.d(parcel);
                onActivitySaveInstanceStateByScionActivityInfo(to7Var8, bo7Var2, readLong32);
                break;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_EVENT_BUILD_FAILURE_VALUE:
                IBinder readStrongBinder21 = parcel.readStrongBinder();
                if (readStrongBinder21 != null) {
                    IInterface queryLocalInterface21 = readStrongBinder21.queryLocalInterface("com.google.android.gms.measurement.api.internal.IDynamiteUploadBatchesCallback");
                    if (queryLocalInterface21 instanceof eo7) {
                        eo7Var = (eo7) queryLocalInterface21;
                    } else {
                        eo7Var = new sa7(readStrongBinder21, "com.google.android.gms.measurement.api.internal.IDynamiteUploadBatchesCallback", (byte) 3);
                    }
                }
                tm7.d(parcel);
                retrieveAndUploadBatches(eo7Var);
                break;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SEND_STARTED_VALUE:
                String readString22 = parcel.readString();
                String readString23 = parcel.readString();
                Bundle bundle11 = (Bundle) tm7.a(parcel, Bundle.CREATOR);
                if (parcel.readInt() != 0) {
                    z7 = false;
                    z9 = true;
                } else {
                    z7 = false;
                }
                if (parcel.readInt() != 0) {
                    z8 = true;
                } else {
                    z8 = z7;
                }
                long readLong33 = parcel.readLong();
                long readLong34 = parcel.readLong();
                tm7.d(parcel);
                logEventWithElapsedTime(readString22, readString23, bundle11, z9, z8, readLong33, readLong34);
                break;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SEND_SUCCESS_TIME_VALUE:
                tt2 L14 = ic4.L(parcel.readStrongBinder());
                so7 so7Var2 = (so7) tm7.a(parcel, so7.CREATOR);
                long readLong35 = parcel.readLong();
                long readLong36 = parcel.readLong();
                tm7.d(parcel);
                initializeWithElapsedTime(L14, so7Var2, readLong35, readLong36);
                break;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SEND_FAILURE_TIME_VALUE:
                long readLong37 = parcel.readLong();
                long readLong38 = parcel.readLong();
                tm7.d(parcel);
                resetAnalyticsDataWithElapsedTime(readLong37, readLong38);
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
