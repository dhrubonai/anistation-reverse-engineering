.class public final synthetic Lcom/google/android/play/core/integrity/ap;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lp6/a0;


# static fields
.field public static final synthetic a:Lcom/google/android/play/core/integrity/ap;


# direct methods
.method public static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/play/core/integrity/ap;

    invoke-direct {v0}, Lcom/google/android/play/core/integrity/ap;-><init>()V

    sput-object v0, Lcom/google/android/play/core/integrity/ap;->a:Lcom/google/android/play/core/integrity/ap;

    return-void
.end method

.method private synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroid/os/IBinder;)Ljava/lang/Object;
    .locals 2

    .line 1
    sget v0, Lp6/m;->d:I

    .line 2
    .line 3
    if-nez p1, :cond_0

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    goto :goto_0

    .line 7
    :cond_0
    const-string v0, "com.google.android.play.core.integrity.protocol.IExpressIntegrityService"

    .line 8
    .line 9
    invoke-interface {p1, v0}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    instance-of v1, v0, Lp6/n;

    .line 14
    .line 15
    if-eqz v1, :cond_1

    .line 16
    .line 17
    move-object p1, v0

    .line 18
    check-cast p1, Lp6/n;

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_1
    new-instance v0, Lp6/l;

    .line 22
    .line 23
    invoke-direct {v0, p1}, Lp6/l;-><init>(Landroid/os/IBinder;)V

    .line 24
    .line 25
    .line 26
    move-object p1, v0

    .line 27
    :goto_0
    return-object p1
.end method
