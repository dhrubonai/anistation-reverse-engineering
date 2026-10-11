package com.unity3d.services.ads.offerwall;

import com.unity3d.services.ads.offerwall.OfferwallAdapterBridge;
import com.unity3d.services.core.log.DeviceLog;
import defpackage.d46;
import defpackage.fn5;
import defpackage.h41;
import defpackage.in5;
import defpackage.jn5;
import defpackage.q71;
import defpackage.rb3;
import defpackage.sb2;
import defpackage.t44;
import defpackage.tl7;
import defpackage.v11;
import defpackage.y45;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.HashMap;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class OfferwallAdapterBridge {
    public static final Companion Companion = new Companion(null);
    private static final String TAPJOY_CLASS_NAME = "com.tapjoy.Tapjoy";
    private static final String UNKNOWN_VERSION = "0.0.0";
    private final t44 _offerwallEventFlow;
    private final rb3 cachedVersion$delegate;
    private final fn5 offerwallEventFlow;
    private final HashMap<String, Object> placementsMap;
    private final v11 scope;
    private final rb3 tapjoyClass$delegate;
    private final String tapjoyClassName;

    public OfferwallAdapterBridge(v11 v11Var, String str) {
        v11Var.getClass();
        str.getClass();
        this.scope = v11Var;
        this.tapjoyClassName = str;
        final byte b = 0;
        in5 b2 = jn5.b(0, 0, null, 7);
        this._offerwallEventFlow = b2;
        this.offerwallEventFlow = h41.c(b2);
        this.placementsMap = new HashMap<>();
        this.tapjoyClass$delegate = new d46(new sb2(this) { // from class: sc4
            public final /* synthetic */ OfferwallAdapterBridge y;

            {
                this.y = this;
            }

            @Override // defpackage.sb2
            public final Object invoke() {
                Class tapjoyClass_delegate$lambda$1;
                String cachedVersion_delegate$lambda$3;
                byte b3 = b;
                OfferwallAdapterBridge offerwallAdapterBridge = this.y;
                switch (b3) {
                    case 0:
                        tapjoyClass_delegate$lambda$1 = OfferwallAdapterBridge.tapjoyClass_delegate$lambda$1(offerwallAdapterBridge);
                        return tapjoyClass_delegate$lambda$1;
                    default:
                        cachedVersion_delegate$lambda$3 = OfferwallAdapterBridge.cachedVersion_delegate$lambda$3(offerwallAdapterBridge);
                        return cachedVersion_delegate$lambda$3;
                }
            }
        });
        final byte b3 = 1;
        this.cachedVersion$delegate = new d46(new sb2(this) { // from class: sc4
            public final /* synthetic */ OfferwallAdapterBridge y;

            {
                this.y = this;
            }

            @Override // defpackage.sb2
            public final Object invoke() {
                Class tapjoyClass_delegate$lambda$1;
                String cachedVersion_delegate$lambda$3;
                byte b32 = b3;
                OfferwallAdapterBridge offerwallAdapterBridge = this.y;
                switch (b32) {
                    case 0:
                        tapjoyClass_delegate$lambda$1 = OfferwallAdapterBridge.tapjoyClass_delegate$lambda$1(offerwallAdapterBridge);
                        return tapjoyClass_delegate$lambda$1;
                    default:
                        cachedVersion_delegate$lambda$3 = OfferwallAdapterBridge.cachedVersion_delegate$lambda$3(offerwallAdapterBridge);
                        return cachedVersion_delegate$lambda$3;
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String cachedVersion_delegate$lambda$3(OfferwallAdapterBridge offerwallAdapterBridge) {
        Object y45Var;
        Object obj;
        Method declaredMethod;
        Object obj2 = null;
        try {
            Class<?> tapjoyClass = offerwallAdapterBridge.getTapjoyClass();
            if (tapjoyClass != null && (declaredMethod = tapjoyClass.getDeclaredMethod("getVersion", null)) != null) {
                obj = declaredMethod.invoke(null, null);
            } else {
                obj = null;
            }
            y45Var = (String) obj;
        } catch (Throwable th) {
            y45Var = new y45(th);
        }
        if (!(y45Var instanceof y45)) {
            obj2 = y45Var;
        }
        String str = (String) obj2;
        if (str == null) {
            return UNKNOWN_VERSION;
        }
        return str;
    }

    private final String getCachedVersion() {
        return (String) this.cachedVersion$delegate.getValue();
    }

    private final Object getPlacement(String str) {
        return Class.forName(this.tapjoyClassName).getDeclaredMethod("getPlacement", String.class, Class.forName("com.tapjoy.TJPlacementListener")).invoke(null, str, Proxy.newProxyInstance(Class.forName("com.tapjoy.TJPlacementListener").getClassLoader(), new Class[]{Class.forName("com.tapjoy.TJPlacementListener")}, tapjoyPlacementListener()));
    }

    private final String getPlacementName(Object obj) {
        return (String) obj.getClass().getDeclaredMethod("getName", null).invoke(obj, null);
    }

    private final Class<?> getTapjoyClass() {
        return (Class) this.tapjoyClass$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Class tapjoyClass_delegate$lambda$1(OfferwallAdapterBridge offerwallAdapterBridge) {
        Object y45Var;
        try {
            y45Var = Class.forName(offerwallAdapterBridge.tapjoyClassName);
        } catch (Throwable th) {
            y45Var = new y45(th);
        }
        if (y45Var instanceof y45) {
            y45Var = null;
        }
        return (Class) y45Var;
    }

    private final InvocationHandler tapjoyPlacementListener() {
        return new InvocationHandler() { // from class: tc4
            @Override // java.lang.reflect.InvocationHandler
            public final Object invoke(Object obj, Method method, Object[] objArr) {
                Object tapjoyPlacementListener$lambda$5;
                tapjoyPlacementListener$lambda$5 = OfferwallAdapterBridge.tapjoyPlacementListener$lambda$5(OfferwallAdapterBridge.this, obj, method, objArr);
                return tapjoyPlacementListener$lambda$5;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static final Object tapjoyPlacementListener$lambda$5(OfferwallAdapterBridge offerwallAdapterBridge, Object obj, Method method, Object[] objArr) {
        String str;
        String name = method.getName();
        if (name != null) {
            boolean z = false;
            switch (name.hashCode()) {
                case -1508301783:
                    if (name.equals("onContentReady")) {
                        Object obj2 = objArr[0];
                        obj2.getClass();
                        String placementName = offerwallAdapterBridge.getPlacementName(obj2);
                        DeviceLog.debug("Placement content ready: " + placementName);
                        tl7.z(offerwallAdapterBridge.scope, null, null, new OfferwallAdapterBridge$tapjoyPlacementListener$1$3(offerwallAdapterBridge, placementName, null), 3);
                        break;
                    }
                    break;
                case -1482787952:
                    if (name.equals("onContentDismiss")) {
                        Object obj3 = objArr[0];
                        obj3.getClass();
                        String placementName2 = offerwallAdapterBridge.getPlacementName(obj3);
                        DeviceLog.debug("Placement content dismissed: " + placementName2);
                        tl7.z(offerwallAdapterBridge.scope, null, null, new OfferwallAdapterBridge$tapjoyPlacementListener$1$5(offerwallAdapterBridge, placementName2, null), 3);
                        return null;
                    }
                    break;
                case 89925559:
                    if (name.equals("onContentShow")) {
                        Object obj4 = objArr[0];
                        obj4.getClass();
                        String placementName3 = offerwallAdapterBridge.getPlacementName(obj4);
                        DeviceLog.debug("Placement content shown: " + placementName3);
                        tl7.z(offerwallAdapterBridge.scope, null, null, new OfferwallAdapterBridge$tapjoyPlacementListener$1$4(offerwallAdapterBridge, placementName3, null), 3);
                        return null;
                    }
                    break;
                case 1356881459:
                    if (name.equals("onRequestSuccess")) {
                        Object obj5 = objArr[0];
                        obj5.getClass();
                        String placementName4 = offerwallAdapterBridge.getPlacementName(obj5);
                        Boolean bool = (Boolean) obj5.getClass().getDeclaredMethod("isContentAvailable", null).invoke(obj5, null);
                        if (bool != null) {
                            z = bool.booleanValue();
                        }
                        DeviceLog.debug("Placement request succeeded: " + placementName4 + " - isContentAvailable: " + z);
                        tl7.z(offerwallAdapterBridge.scope, null, null, new OfferwallAdapterBridge$tapjoyPlacementListener$1$1(z, offerwallAdapterBridge, placementName4, null), 3);
                        return null;
                    }
                    break;
                case 2137477050:
                    if (name.equals("onRequestFailure")) {
                        Object obj6 = objArr[0];
                        obj6.getClass();
                        String placementName5 = offerwallAdapterBridge.getPlacementName(obj6);
                        HashMap<String, Object> hashMap = offerwallAdapterBridge.placementsMap;
                        if (placementName5 == null) {
                            str = "";
                        } else {
                            str = placementName5;
                        }
                        hashMap.remove(str);
                        Object obj7 = objArr[1];
                        DeviceLog.error("Placement request failed: " + placementName5 + " - errorCode: " + ((Integer) obj7.getClass().getField("code").get(obj7)) + ", errorMessage: " + ((String) obj7.getClass().getField("message").get(obj7)));
                        tl7.z(offerwallAdapterBridge.scope, null, null, new OfferwallAdapterBridge$tapjoyPlacementListener$1$2(offerwallAdapterBridge, placementName5, null), 3);
                        return null;
                    }
                    break;
            }
        }
        return null;
    }

    public final fn5 getOfferwallEventFlow() {
        return this.offerwallEventFlow;
    }

    public final String getVersion() {
        return getCachedVersion();
    }

    public final boolean isAdReady(String str) {
        Method method;
        str.getClass();
        Object placement = getPlacement(str);
        Object obj = null;
        if (placement != null) {
            method = placement.getClass().getDeclaredMethod("isContentReady", null);
        } else {
            method = null;
        }
        if (method != null) {
            obj = method.invoke(placement, null);
        }
        Boolean bool = (Boolean) obj;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public final boolean isConnected() {
        Object y45Var;
        Object obj;
        Method declaredMethod;
        Object obj2 = null;
        try {
            Class<?> tapjoyClass = getTapjoyClass();
            if (tapjoyClass != null && (declaredMethod = tapjoyClass.getDeclaredMethod("isConnected", null)) != null) {
                obj = declaredMethod.invoke(null, null);
            } else {
                obj = null;
            }
            y45Var = (Boolean) obj;
        } catch (Throwable th) {
            y45Var = new y45(th);
        }
        if (!(y45Var instanceof y45)) {
            obj2 = y45Var;
        }
        Boolean bool = (Boolean) obj2;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public final void loadAd(String str) {
        Method method;
        str.getClass();
        Object placement = getPlacement(str);
        this.placementsMap.put(str, placement);
        if (placement != null) {
            method = placement.getClass().getDeclaredMethod("requestContent", null);
        } else {
            method = null;
        }
        if (method != null) {
            method.invoke(placement, null);
        }
    }

    public final void showAd(String str) {
        Method method;
        Object obj;
        boolean z;
        Method method2;
        str.getClass();
        Object obj2 = this.placementsMap.get(str);
        if (obj2 != null) {
            method = obj2.getClass().getDeclaredMethod("isContentAvailable", null);
        } else {
            method = null;
        }
        if (method != null) {
            obj = method.invoke(obj2, null);
        } else {
            obj = null;
        }
        Boolean bool = (Boolean) obj;
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            z = false;
        }
        if (z) {
            if (obj2 != null) {
                method2 = obj2.getClass().getDeclaredMethod("showContent", null);
            } else {
                method2 = null;
            }
            if (method2 != null) {
                method2.invoke(obj2, null);
            }
        } else {
            tl7.z(this.scope, null, null, new OfferwallAdapterBridge$showAd$1(this, str, null), 3);
        }
        this.placementsMap.remove(str);
    }

    /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(q71 q71Var) {
            this();
        }

        private Companion() {
        }
    }

    public /* synthetic */ OfferwallAdapterBridge(v11 v11Var, String str, int i, q71 q71Var) {
        this(v11Var, (i & 2) != 0 ? TAPJOY_CLASS_NAME : str);
    }
}
