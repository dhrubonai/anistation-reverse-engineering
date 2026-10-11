package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import com.anistation.android.AniStationApplication;
import com.anistation.navigation.Route;
import com.anistation.navigation.a;
import com.unity3d.ads.core.extensions.ContextExtensionsKt;
import com.unity3d.services.core.di.ServiceProvider;
import java.io.File;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class rg implements sb2 {
    public final /* synthetic */ byte x;
    public final /* synthetic */ Context y;

    public /* synthetic */ rg(Context context, byte b) {
        this.x = b;
        this.y = context;
    }

    @Override // defpackage.sb2
    public final Object invoke() {
        int i;
        File file;
        int S;
        ConnectivityManager connectivityManager;
        Route route;
        Network activeNetwork;
        NetworkCapabilities networkCapabilities;
        File unityAdsDataStoreFile;
        File unityAdsDataStoreFile2;
        byte b = this.x;
        Context context = this.y;
        switch (b) {
            case 0:
                int i2 = AniStationApplication.x;
                fr0 fr0Var = new fr0((byte) 9);
                try {
                    Object systemService = context.getSystemService((Class<Object>) ActivityManager.class);
                    systemService.getClass();
                    ActivityManager activityManager = (ActivityManager) systemService;
                    if ((context.getApplicationInfo().flags & 1048576) != 0) {
                        i = activityManager.getLargeMemoryClass();
                    } else {
                        i = activityManager.getMemoryClass();
                    }
                } catch (Exception unused) {
                    i = 256;
                }
                return new nz4(new wv((long) (0.25d * i * 1048576), fr0Var), fr0Var);
            case 1:
                int i3 = AniStationApplication.x;
                b73 b73Var = n22.x;
                File cacheDir = context.getCacheDir();
                cacheDir.getClass();
                File file2 = new File("image_cache");
                String path = file2.getPath();
                path.getClass();
                char c = File.separatorChar;
                int i4 = 0;
                int S2 = uz5.S(path, c, 0, 4);
                if (S2 == 0) {
                    if (path.length() > 1 && path.charAt(1) == c && (S = uz5.S(path, c, 2, 4)) >= 0) {
                        int S3 = uz5.S(path, c, S + 1, 4);
                        i4 = S3 >= 0 ? S3 + 1 : path.length();
                    } else {
                        i4 = 1;
                    }
                } else if (S2 > 0 && path.charAt(S2 - 1) == ':') {
                    i4 = S2 + 1;
                } else if (S2 == -1 && uz5.P(path, ':')) {
                    i4 = path.length();
                }
                if (i4 <= 0) {
                    String file3 = cacheDir.toString();
                    file3.getClass();
                    if (file3.length() == 0 || uz5.P(file3, c)) {
                        file = new File(file3 + file2);
                    } else {
                        file = new File(file3 + c + file2);
                    }
                    file2 = file;
                }
                String str = qj4.y;
                return new gz4(262144000L, b73Var, r18.n(file2));
            case 2:
                context.getClass();
                Object systemService2 = context.getSystemService("connectivity");
                if (systemService2 instanceof ConnectivityManager) {
                    connectivityManager = (ConnectivityManager) systemService2;
                } else {
                    connectivityManager = null;
                }
                if (connectivityManager != null && (activeNetwork = connectivityManager.getActiveNetwork()) != null && (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) != null && networkCapabilities.hasCapability(12) && networkCapabilities.hasCapability(16)) {
                    route = Route.Home.INSTANCE;
                } else {
                    route = Route.Downloads.INSTANCE;
                }
                return new a(route);
            case 3:
                unityAdsDataStoreFile = ContextExtensionsKt.unityAdsDataStoreFile(context, ServiceProvider.DATA_STORE_GL_INFO);
                return unityAdsDataStoreFile;
            default:
                unityAdsDataStoreFile2 = ContextExtensionsKt.unityAdsDataStoreFile(context, ServiceProvider.DATA_STORE_WEBVIEW_CONFIG);
                return unityAdsDataStoreFile2;
        }
    }
}
