package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class i97 {
    public static final i97 A;
    public static final i97 B;
    public static final i97 C;
    public static final /* synthetic */ i97[] D;
    public static final /* synthetic */ tv1 E;
    public static final i97 z;
    public final char x;
    public final char y;

    static {
        i97 i97Var = new i97("OBJ", 0, '{', '}');
        z = i97Var;
        i97 i97Var2 = new i97("LIST", 1, '[', ']');
        A = i97Var2;
        i97 i97Var3 = new i97("MAP", 2, '{', '}');
        B = i97Var3;
        i97 i97Var4 = new i97("POLY_OBJ", 3, '[', ']');
        C = i97Var4;
        i97[] i97VarArr = {i97Var, i97Var2, i97Var3, i97Var4};
        D = i97VarArr;
        E = new tv1(i97VarArr);
    }

    public i97(String str, int i, char c, char c2) {
        this.x = c;
        this.y = c2;
    }

    public static i97 valueOf(String str) {
        return (i97) Enum.valueOf(i97.class, str);
    }

    public static i97[] values() {
        return (i97[]) D.clone();
    }
}
