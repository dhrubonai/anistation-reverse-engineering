package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class zu0 implements sb2 {
    public final /* synthetic */ byte x;

    public /* synthetic */ zu0(dn0 dn0Var) {
        this.x = (byte) 24;
    }

    @Override // defpackage.sb2
    public final Object invoke() {
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        switch (b) {
            case 0:
            case 1:
                return null;
            case 2:
                bv0.b("LocalViewConfiguration");
                throw null;
            case 3:
                bv0.b("LocalWindowInfo");
                throw null;
            case 4:
                return new Object();
            case 5:
                return null;
            case 6:
                bv0.b("LocalAutofillTree");
                throw null;
            case 7:
                bv0.b("LocalAutofillManager");
                throw null;
            case 8:
                bv0.b("LocalClipboardManager");
                throw null;
            case 9:
                bv0.b("LocalClipboard");
                throw null;
            case 10:
                bv0.b("LocalGraphicsContext");
                throw null;
            case 11:
                bv0.b("LocalFontFamilyResolver");
                throw null;
            case 12:
                bv0.b("LocalDensity");
                throw null;
            case 13:
                bv0.b("LocalFocusManager");
                throw null;
            case 14:
                bv0.b("LocalFontLoader");
                throw null;
            case 15:
                bv0.b("LocalHapticFeedback");
                throw null;
            case 16:
                bv0.b("LocalInputManager");
                throw null;
            case 17:
                bv0.b("LocalLayoutDirection");
                throw null;
            case 18:
                bv0.b("LocalProvidableLocaleList");
                throw null;
            case 19:
            case 20:
                return null;
            case 21:
                bv0.b("LocalTextToolbar");
                throw null;
            case 22:
                bv0.b("LocalUriHandler");
                throw null;
            case 23:
                eu0.b("Unexpected call to default provider");
                throw new er0((byte) 3);
            case 24:
                int i = hi5.a;
                return new fi5(100);
            case 25:
                return pn6Var;
            case 26:
                return xt5.g(cw1.y);
            case 27:
                return new qi4(0);
            case 28:
                return pn6Var;
            default:
                return u93.a("io.ktor.client.plugins.SaveBody");
        }
    }

    public /* synthetic */ zu0(byte b) {
        this.x = b;
    }
}
