package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class dl2 {
    public static final dl2 d;
    public final boolean a;
    public final bl2 b;
    public final cl2 c;

    static {
        bl2 bl2Var = bl2.c;
        cl2 cl2Var = cl2.a;
        d = new dl2(false, bl2Var, cl2Var);
        new dl2(true, bl2Var, cl2Var);
    }

    public dl2(boolean z, bl2 bl2Var, cl2 cl2Var) {
        bl2Var.getClass();
        cl2Var.getClass();
        this.a = z;
        this.b = bl2Var;
        this.c = cl2Var;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("HexFormat(\n    upperCase = ");
        sb.append(this.a);
        sb.append(",\n    bytes = BytesHexFormat(\n");
        this.b.a(sb, "        ");
        sb.append('\n');
        sb.append("    ),");
        sb.append('\n');
        sb.append("    number = NumberHexFormat(");
        sb.append('\n');
        this.c.a(sb, "        ");
        sb.append('\n');
        sb.append("    )");
        sb.append('\n');
        sb.append(")");
        return sb.toString();
    }
}
