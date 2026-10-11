package defpackage;

import com.anistation.model.watch.Server;
import com.anistation.navigation.Route;
import com.unity3d.ads.core.data.datasource.AndroidUnityInfoDataSource;
import com.unity3d.ads.core.data.datasource.FIdExistenceDataSource;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.services.core.di.ServiceProvider;
import com.unity3d.services.store.core.StoreExceptionHandler;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.ServiceConfigurationError;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class r75 implements sb2 {
    public final /* synthetic */ byte x;

    public /* synthetic */ r75(byte b) {
        this.x = b;
    }

    /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.Object, ld4] */
    /* JADX WARN: Type inference failed for: r2v3, types: [je2, java.lang.Object] */
    @Override // defpackage.sb2
    public final Object invoke() {
        ServiceConfigurationError serviceConfigurationError;
        StoreExceptionHandler initialize$lambda$246$lambda$190;
        HandleInvocationsFromAdViewer initialize$lambda$246$lambda$201;
        FIdExistenceDataSource initialize$lambda$246$lambda$229;
        AndroidUnityInfoDataSource initialize$lambda$246$lambda$236;
        switch (this.x) {
            case 0:
                return Route.Backup.a();
            case 1:
                return Route.BugReport.a();
            case 2:
                return Route.Donate.a();
            case 3:
                return Route.DownloadSettings.a();
            case 4:
                return Route.Downloads.a();
            case 5:
                return Route.ExperimentalSettings.a();
            case 6:
                return Route.Home.a();
            case 7:
                return Route.ImportExport.a();
            case 8:
                return Route.MyList.a();
            case 9:
                return Route.PlayerSettings.a();
            case 10:
                return Route.Schedule.a();
            case 11:
                return Route.Search.a();
            case 12:
                return Route.Settings.a();
            case 13:
                return Route.SubtitleSettings.a();
            case 14:
                return new k95(new LinkedHashMap());
            case 15:
                return null;
            case 16:
                return new HashSet();
            case 17:
                return new yc5(0);
            case 18:
                return xt5.g(null);
            case 19:
                return xt5.g(Boolean.FALSE);
            case 20:
                return null;
            case 21:
                throw new IllegalArgumentException("It is not possible to retrieve an array serializer using KClass alone, use KType instead or ArraySerializer factory");
            case 22:
                return Server.b();
            case 23:
                return Server.a();
            case 24:
                try {
                    return oi4.I(wi5.u0(wi5.o0(Arrays.asList(new Object()).iterator())));
                } finally {
                }
            case 25:
                try {
                    return oi4.I(wi5.u0(wi5.o0(Arrays.asList(new Object()).iterator())));
                } finally {
                }
            case 26:
                initialize$lambda$246$lambda$190 = ServiceProvider.initialize$lambda$246$lambda$190();
                return initialize$lambda$246$lambda$190;
            case 27:
                initialize$lambda$246$lambda$201 = ServiceProvider.initialize$lambda$246$lambda$201();
                return initialize$lambda$246$lambda$201;
            case 28:
                initialize$lambda$246$lambda$229 = ServiceProvider.initialize$lambda$246$lambda$229();
                return initialize$lambda$246$lambda$229;
            default:
                initialize$lambda$246$lambda$236 = ServiceProvider.initialize$lambda$246$lambda$236();
                return initialize$lambda$246$lambda$236;
        }
    }
}
