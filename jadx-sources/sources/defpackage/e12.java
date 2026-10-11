package defpackage;

import android.net.Uri;
import java.util.Map;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public interface e12 {
    public static final i3 a = new e12() { // from class: i3
        public final /* synthetic */ byte b = 3;

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.e12
        public final b12[] c() {
            int i = 0;
            switch (this.b) {
                case 0:
                    return new b12[]{new j3()};
                case 1:
                    return new b12[]{new l3()};
                case 2:
                    return new b12[]{new v6(0)};
                case 3:
                    return new b12[0];
                case 4:
                    return new b12[]{new c42()};
                case 5:
                    return new b12[]{new c72()};
                case 6:
                    return new b12[]{new t14(16, w16.o)};
                case 7:
                    return new b12[]{new Object()};
                case 8:
                    return new b12[]{new tw4()};
                case 9:
                    tf6 tf6Var = new tf6(0L);
                    z62 z62Var = nw2.y;
                    return new b12[]{new jk6(1, 1, w16.o, tf6Var, new rb1(i, o15.B))};
                default:
                    return new b12[]{new z27()};
            }
        }
    };

    b12[] c();

    default b12[] d(Uri uri, Map map) {
        return c();
    }

    default void a() {
    }

    default void e() {
    }

    default void b(w16 w16Var) {
    }
}
