package defpackage;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class s71 implements q41 {
    public b22 A;
    public xs B;
    public ky0 C;
    public q41 D;
    public qm6 E;
    public n41 F;
    public hy4 G;
    public q41 H;
    public final Context x;
    public final ArrayList y;
    public final q41 z;

    public s71(Context context, q41 q41Var) {
        this.x = context.getApplicationContext();
        q41Var.getClass();
        this.z = q41Var;
        this.y = new ArrayList();
    }

    public static void b(q41 q41Var, n71 n71Var) {
        if (q41Var != null) {
            q41Var.z(n71Var);
        }
    }

    public final void a(q41 q41Var) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.y;
            if (i < arrayList.size()) {
                q41Var.z((n71) arrayList.get(i));
                i++;
            } else {
                return;
            }
        }
    }

    @Override // defpackage.q41
    public final void close() {
        q41 q41Var = this.H;
        if (q41Var != null) {
            try {
                q41Var.close();
            } finally {
                this.H = null;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v33, types: [i30, n41, q41] */
    /* JADX WARN: Type inference failed for: r0v7, types: [b22, i30, q41] */
    @Override // defpackage.q41
    public final long h(v41 v41Var) {
        boolean z;
        q41 q41Var;
        if (this.H == null) {
            z = true;
        } else {
            z = false;
        }
        io3.B(z);
        Uri uri = v41Var.a;
        String scheme = uri.getScheme();
        String str = eq6.a;
        String scheme2 = uri.getScheme();
        boolean isEmpty = TextUtils.isEmpty(scheme2);
        Context context = this.x;
        if (!isEmpty && !Objects.equals(scheme2, "file")) {
            if ("asset".equals(scheme)) {
                if (this.B == null) {
                    xs xsVar = new xs(context);
                    this.B = xsVar;
                    a(xsVar);
                }
                q41Var = this.B;
                this.H = q41Var;
            } else if (HandleInvocationsFromAdViewer.KEY_PRIVACY_UPDATE_CONTENT.equals(scheme)) {
                if (this.C == null) {
                    ky0 ky0Var = new ky0(context);
                    this.C = ky0Var;
                    a(ky0Var);
                }
                q41Var = this.C;
                this.H = q41Var;
            } else {
                boolean equals = "rtmp".equals(scheme);
                q41 q41Var2 = this.z;
                if (equals) {
                    q41Var = this.D;
                    if (q41Var == null) {
                        try {
                            q41 q41Var3 = (q41) Class.forName("androidx.media3.datasource.rtmp.RtmpDataSource").getConstructor(null).newInstance(null);
                            this.D = q41Var3;
                            a(q41Var3);
                        } catch (ClassNotFoundException unused) {
                            kb0.O("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
                        } catch (Exception e) {
                            ov3.k("Error instantiating RTMP extension", e);
                            return 0L;
                        }
                        q41 q41Var4 = this.D;
                        if (q41Var4 == null) {
                            this.D = q41Var2;
                        } else {
                            q41Var2 = q41Var4;
                        }
                        q41Var = q41Var2;
                    }
                    this.H = q41Var;
                } else if ("udp".equals(scheme)) {
                    if (this.E == null) {
                        qm6 qm6Var = new qm6();
                        this.E = qm6Var;
                        a(qm6Var);
                    }
                    q41Var = this.E;
                    this.H = q41Var;
                } else if ("data".equals(scheme)) {
                    if (this.F == null) {
                        ?? i30Var = new i30(false);
                        this.F = i30Var;
                        a(i30Var);
                    }
                    q41Var = this.F;
                    this.H = q41Var;
                } else if (!"rawresource".equals(scheme) && !"android.resource".equals(scheme)) {
                    this.H = q41Var2;
                    q41Var = q41Var2;
                } else {
                    if (this.G == null) {
                        hy4 hy4Var = new hy4(context);
                        this.G = hy4Var;
                        a(hy4Var);
                    }
                    q41Var = this.G;
                    this.H = q41Var;
                }
            }
        } else {
            String path = uri.getPath();
            if (path != null && path.startsWith("/android_asset/")) {
                if (this.B == null) {
                    xs xsVar2 = new xs(context);
                    this.B = xsVar2;
                    a(xsVar2);
                }
                q41Var = this.B;
                this.H = q41Var;
            } else {
                if (this.A == null) {
                    ?? i30Var2 = new i30(false);
                    this.A = i30Var2;
                    a(i30Var2);
                }
                q41Var = this.A;
                this.H = q41Var;
            }
        }
        return q41Var.h(v41Var);
    }

    @Override // defpackage.m41
    public final int read(byte[] bArr, int i, int i2) {
        q41 q41Var = this.H;
        q41Var.getClass();
        return q41Var.read(bArr, i, i2);
    }

    @Override // defpackage.q41
    public final Map s() {
        q41 q41Var = this.H;
        if (q41Var == null) {
            return Collections.EMPTY_MAP;
        }
        return q41Var.s();
    }

    @Override // defpackage.q41
    public final Uri y() {
        q41 q41Var = this.H;
        if (q41Var == null) {
            return null;
        }
        return q41Var.y();
    }

    @Override // defpackage.q41
    public final void z(n71 n71Var) {
        n71Var.getClass();
        this.z.z(n71Var);
        this.y.add(n71Var);
        b(this.A, n71Var);
        b(this.B, n71Var);
        b(this.C, n71Var);
        b(this.D, n71Var);
        b(this.E, n71Var);
        b(this.F, n71Var);
        b(this.G, n71Var);
    }
}
