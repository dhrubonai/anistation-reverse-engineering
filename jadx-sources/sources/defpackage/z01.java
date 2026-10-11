package defpackage;

import android.content.Context;
import android.widget.Toast;
import com.anistation.model.watch.Track;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class z01 extends t36 implements ic2 {
    public final /* synthetic */ Object A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ byte x;
    public /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z01(Object obj, Object obj2, String str, Object obj3, vz0 vz0Var, byte b) {
        super(2, vz0Var);
        this.x = b;
        this.y = obj;
        this.z = obj2;
        this.A = str;
        this.B = obj3;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        byte b = this.x;
        Object obj2 = this.B;
        Object obj3 = this.A;
        Object obj4 = this.z;
        switch (b) {
            case 0:
                z01 z01Var = new z01((yq4) obj4, (k96) obj3, (jb6) obj2, vz0Var);
                z01Var.y = obj;
                return z01Var;
            case 1:
                return new z01((Track) this.y, (rs) obj4, (String) obj3, (Map) obj2, vz0Var, (byte) 1);
            default:
                return new z01((Context) this.y, (String) obj4, (String) obj3, (w44) obj2, vz0Var, (byte) 2);
        }
    }

    @Override // defpackage.ic2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        v11 v11Var = (v11) obj;
        vz0 vz0Var = (vz0) obj2;
        switch (b) {
            case 0:
                ((z01) create(v11Var, vz0Var)).invokeSuspend(pn6Var);
                return pn6Var;
            case 1:
                return ((z01) create(v11Var, vz0Var)).invokeSuspend(pn6Var);
            default:
                ((z01) create(v11Var, vz0Var)).invokeSuspend(pn6Var);
                return pn6Var;
        }
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        Object obj2 = this.A;
        Object obj3 = this.z;
        Object obj4 = this.B;
        vz0 vz0Var = null;
        switch (b) {
            case 0:
                m37.N(obj);
                v11 v11Var = (v11) this.y;
                yq4 yq4Var = (yq4) obj3;
                y01 y01Var = new y01(yq4Var, (k96) obj2, vz0Var, (byte) 0);
                y11 y11Var = y11.A;
                tl7.z(v11Var, null, y11Var, y01Var, 1);
                tl7.z(v11Var, null, y11Var, new c0(yq4Var, (jb6) obj4, vz0Var, (byte) 24), 1);
                return pn6Var;
            case 1:
                rs rsVar = (rs) obj3;
                File file = rsVar.b;
                m37.N(obj);
                Track track = (Track) this.y;
                String str = "vtt";
                String n0 = uz5.n0('.', uz5.p0(track.getUrl(), '?'), "vtt");
                int length = n0.length();
                if (2 > length || length >= 6) {
                    n0 = null;
                }
                if (n0 != null) {
                    str = n0;
                }
                String str2 = (String) obj2;
                Pattern compile = Pattern.compile("[^A-Za-z0-9._-]");
                compile.getClass();
                str2.getClass();
                String replaceAll = compile.matcher(str2).replaceAll("_");
                replaceAll.getClass();
                File file2 = new File(file, qx1.m(replaceAll, ".", str));
                File file3 = new File(file, h11.j(file2.getName(), ".partial"));
                kz kzVar = new kz((byte) 8);
                kzVar.E(track.getUrl());
                for (Map.Entry entry : ((Map) obj4).entrySet()) {
                    kzVar.y((String) entry.getKey(), (String) entry.getValue());
                }
                l35 r = kzVar.r();
                jd4 jd4Var = rsVar.a;
                jd4Var.getClass();
                p45 e = new bz4(jd4Var, r).e();
                try {
                    if (e.l()) {
                        t45 t45Var = e.D;
                        if (t45Var != null) {
                            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file3), 8192);
                            try {
                                InputStream a = t45Var.a();
                                try {
                                    kb0.o(a, bufferedOutputStream);
                                    a.close();
                                    bufferedOutputStream.close();
                                    e.close();
                                    if (file2.exists() && !file2.delete()) {
                                        file3.delete();
                                        qi2.k("Could not replace the existing subtitle");
                                        return null;
                                    }
                                    if (file3.renameTo(file2)) {
                                        return file2;
                                    }
                                    file3.delete();
                                    qi2.k("Could not save the subtitle");
                                    return null;
                                } finally {
                                }
                            } catch (Throwable th) {
                                try {
                                    throw th;
                                } catch (Throwable th2) {
                                    a34.C(bufferedOutputStream, th);
                                    throw th2;
                                }
                            }
                        } else {
                            throw new IOException("Subtitle response was empty");
                        }
                    } else {
                        throw new IOException("Subtitle request failed with HTTP " + e.A);
                    }
                } catch (Throwable th3) {
                    try {
                        throw th3;
                    } catch (Throwable th4) {
                        a34.C(e, th3);
                        throw th4;
                    }
                }
            default:
                Context context = (Context) this.y;
                m37.N(obj);
                w44 w44Var = (w44) obj4;
                tw5 tw5Var = s07.a;
                if (((ym6) w44Var.getValue()).E) {
                    Toast.makeText(context, (String) obj3, 1).show();
                }
                if (((ym6) w44Var.getValue()).F) {
                    Toast.makeText(context, (String) obj2, 1).show();
                }
                return pn6Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z01(yq4 yq4Var, k96 k96Var, jb6 jb6Var, vz0 vz0Var) {
        super(2, vz0Var);
        this.x = (byte) 0;
        this.z = yq4Var;
        this.A = k96Var;
        this.B = jb6Var;
    }
}
