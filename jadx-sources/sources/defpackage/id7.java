package defpackage;

import android.util.Log;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Level;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class id7 extends qt0 {
    public static final Set C;
    public static final jb8 D;
    public static final gd7 E;
    public final Set A;
    public final jb8 B;
    public final String y;
    public final Level z;

    static {
        Set unmodifiableSet = Collections.unmodifiableSet(new HashSet(Arrays.asList(p98.a, ta8.a, va8.a)));
        C = unmodifiableSet;
        jb8 jb8Var = new jb8(x97.Y(unmodifiableSet));
        D = jb8Var;
        E = new gd7(Level.ALL, unmodifiableSet, jb8Var);
    }

    public /* synthetic */ id7(String str, Level level, Set set, jb8 jb8Var) {
        super(str);
        this.y = et5.n(str);
        this.z = level;
        this.A = set;
        this.B = jb8Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0343  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x02b3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:157:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0471  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0492  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void M(defpackage.l98 r30, java.lang.String r31, java.util.logging.Level r32, java.util.Set r33, defpackage.jb8 r34) {
        /*
            Method dump skipped, instructions count: 1190
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.id7.M(l98, java.lang.String, java.util.logging.Level, java.util.Set, jb8):void");
    }

    @Override // defpackage.qt0
    public final boolean I(Level level) {
        int o = et5.o(level);
        if (!Log.isLoggable(this.y, o) && !Log.isLoggable("all", o)) {
            return false;
        }
        return true;
    }

    @Override // defpackage.qt0
    public final void J(l98 l98Var) {
        M(l98Var, this.y, this.z, this.A, this.B);
    }
}
