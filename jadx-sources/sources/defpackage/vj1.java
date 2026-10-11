package defpackage;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteTransactionListener;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import com.anistation.model.Home;
import com.anistation.model.download.DownloadStorageType;
import com.anistation.model.download.external.ExternalDownloadRecord;
import com.anistation.model.download.external.ExternalDownloadRecord$$serializer;
import com.anistation.model.download.external.ExternalDownloadRequest;
import com.unity3d.ads.adplayer.ExposedFunction;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class vj1 implements sb2 {
    public final /* synthetic */ byte x;

    public /* synthetic */ vj1(byte b) {
        this.x = b;
    }

    @Override // defpackage.sb2
    public final Object invoke() {
        Class<?> returnType;
        ExposedFunction invoke$lambda$11;
        ExposedFunction invoke$lambda$12;
        ExposedFunction invoke$lambda$47;
        ExposedFunction invoke$lambda$13;
        ExposedFunction invoke$lambda$14;
        ExposedFunction invoke$lambda$15;
        ExposedFunction invoke$lambda$16;
        ExposedFunction invoke$lambda$17;
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        switch (b) {
            case 0:
                return xt5.g(bw1.y);
            case 1:
                return xt5.g("100");
            case 2:
                return xt5.g("");
            case 3:
            case 4:
                return pn6Var;
            case 5:
                return DownloadStorageType.a();
            case 6:
                return Boolean.TRUE;
            case 7:
                return new Handler(Looper.getMainLooper());
            case 8:
            case 9:
                return pn6Var;
            case 10:
                return ExternalDownloadRecord.a();
            case 11:
                return new ds(ExternalDownloadRecord$$serializer.INSTANCE, (byte) 0);
            case 12:
                return ExternalDownloadRequest.a();
            case 13:
                return Boolean.FALSE;
            case 14:
                try {
                    Method declaredMethod = SQLiteDatabase.class.getDeclaredMethod("getThreadSession", null);
                    declaredMethod.setAccessible(true);
                    return declaredMethod;
                } catch (Throwable unused) {
                    return null;
                }
            case 15:
                try {
                    Method method = (Method) hb2.A.getValue();
                    if (method == null || (returnType = method.getReturnType()) == null) {
                        return null;
                    }
                    Class cls = Integer.TYPE;
                    return returnType.getDeclaredMethod("beginTransaction", cls, SQLiteTransactionListener.class, cls, CancellationSignal.class);
                } catch (Throwable unused2) {
                    return null;
                }
            case 16:
                n47[] values = n47.values();
                values.getClass();
                return new uv1("io.ktor.util.date.WeekDay", values);
            case 17:
                k04[] values2 = k04.values();
                values2.getClass();
                return new uv1("io.ktor.util.date.Month", values2);
            case 18:
                invoke$lambda$11 = HandleInvocationsFromAdViewer.invoke$lambda$11();
                return invoke$lambda$11;
            case 19:
                invoke$lambda$12 = HandleInvocationsFromAdViewer.invoke$lambda$12();
                return invoke$lambda$12;
            case 20:
                invoke$lambda$47 = HandleInvocationsFromAdViewer.invoke$lambda$47();
                return invoke$lambda$47;
            case 21:
                invoke$lambda$13 = HandleInvocationsFromAdViewer.invoke$lambda$13();
                return invoke$lambda$13;
            case 22:
                invoke$lambda$14 = HandleInvocationsFromAdViewer.invoke$lambda$14();
                return invoke$lambda$14;
            case 23:
                invoke$lambda$15 = HandleInvocationsFromAdViewer.invoke$lambda$15();
                return invoke$lambda$15;
            case 24:
                invoke$lambda$16 = HandleInvocationsFromAdViewer.invoke$lambda$16();
                return invoke$lambda$16;
            case 25:
                invoke$lambda$17 = HandleInvocationsFromAdViewer.invoke$lambda$17();
                return invoke$lambda$17;
            case 26:
                return Home.c();
            case 27:
                return Home.a();
            case 28:
                return Home.b();
            default:
                return Home.d();
        }
    }
}
