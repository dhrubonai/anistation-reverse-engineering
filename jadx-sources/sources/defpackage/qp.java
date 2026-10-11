package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.core.content.FileProvider;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.io.File;
import java.io.IOException;
import java.util.Map;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class qp {
    public final Context a;

    public qp(Context context) {
        this.a = context;
    }

    public final pp a(File file) {
        String substring;
        file.getClass();
        Context context = this.a;
        if (!context.getPackageManager().canRequestPackageInstalls()) {
            return np.a;
        }
        g22 b = FileProvider.b(0, context, context.getPackageName() + ".fileprovider");
        try {
            String canonicalPath = file.getCanonicalPath();
            Map.Entry entry = null;
            for (Map.Entry entry2 : b.b.entrySet()) {
                String path = ((File) entry2.getValue()).getPath();
                if (FileProvider.d(canonicalPath).startsWith(FileProvider.d(path).concat("/")) && (entry == null || path.length() > ((File) entry.getValue()).getPath().length())) {
                    entry = entry2;
                }
            }
            if (entry != null) {
                String path2 = ((File) entry.getValue()).getPath();
                if (path2.endsWith("/")) {
                    substring = canonicalPath.substring(path2.length());
                } else {
                    substring = canonicalPath.substring(path2.length() + 1);
                }
                Uri build = new Uri.Builder().scheme(HandleInvocationsFromAdViewer.KEY_PRIVACY_UPDATE_CONTENT).authority(b.a).encodedPath(Uri.encode((String) entry.getKey()) + '/' + Uri.encode(substring, "/")).build();
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setDataAndType(build, "application/vnd.android.package-archive");
                intent.addFlags(268435456);
                intent.addFlags(1);
                context.startActivity(intent);
                return op.a;
            }
            ze0.k(zo5.l("Failed to find configured root that contains ", canonicalPath));
            return null;
        } catch (IOException unused) {
            ov3.f(file, "Failed to resolve canonical path for ");
            return null;
        }
    }
}
