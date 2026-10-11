package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.unity3d.ads.core.data.datasource.AndroidGoogleAppIdDataSource;
import java.util.Objects;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class t32 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;

    public t32(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        boolean z;
        int i = tz5.a;
        if (str != null && !str.trim().isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        a34.A("ApplicationId must be set.", true ^ z);
        this.b = str;
        this.a = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
        this.h = str8;
    }

    public static t32 a(Context context) {
        y23 y23Var = new y23(context);
        String X = y23Var.X(AndroidGoogleAppIdDataSource.GOOGLE_APP_ID_RESOURCE_NAME);
        if (TextUtils.isEmpty(X)) {
            return null;
        }
        return new t32(X, y23Var.X("google_api_key"), y23Var.X("firebase_database_url"), y23Var.X("ga_trackingId"), y23Var.X("gcm_defaultSenderId"), y23Var.X("google_storage_bucket"), y23Var.X("recaptcha_site_key"), y23Var.X("project_id"));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof t32)) {
            return false;
        }
        t32 t32Var = (t32) obj;
        if (!Objects.equals(this.b, t32Var.b) || !Objects.equals(this.a, t32Var.a) || !Objects.equals(this.c, t32Var.c) || !Objects.equals(this.d, t32Var.d) || !Objects.equals(this.e, t32Var.e) || !Objects.equals(this.f, t32Var.f) || !Objects.equals(this.g, t32Var.g) || !Objects.equals(this.h, t32Var.h)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.b, this.a, this.c, this.d, this.e, this.f, this.g, this.h);
    }

    public final String toString() {
        y23 y23Var = new y23(this);
        y23Var.R(this.b, "applicationId");
        y23Var.R(this.a, "apiKey");
        y23Var.R(this.c, "databaseUrl");
        y23Var.R(this.e, "gcmSenderId");
        y23Var.R(this.f, "storageBucket");
        y23Var.R(this.g, "recaptchaSiteKey");
        y23Var.R(this.h, "projectId");
        return y23Var.toString();
    }
}
