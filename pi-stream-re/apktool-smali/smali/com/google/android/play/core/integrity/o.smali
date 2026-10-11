.class final Lcom/google/android/play/core/integrity/o;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lcom/google/android/play/core/integrity/o;

.field private final b:Lp6/h;

.field private final c:Lp6/h;

.field private final d:Lp6/h;

.field private final e:Lp6/h;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/google/android/play/core/integrity/n;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p0, p0, Lcom/google/android/play/core/integrity/o;->a:Lcom/google/android/play/core/integrity/o;

    .line 5
    .line 6
    new-instance p2, Landroidx/fragment/app/o;

    .line 7
    .line 8
    if-eqz p1, :cond_0

    .line 9
    .line 10
    invoke-direct {p2, p1}, Landroidx/fragment/app/o;-><init>(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    iput-object p2, p0, Lcom/google/android/play/core/integrity/o;->b:Lp6/h;

    .line 14
    .line 15
    invoke-static {}, Lcom/google/android/play/core/integrity/y;->a()Lcom/google/android/play/core/integrity/z;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-static {p1}, Lp6/f;->b(Lp6/g;)Lp6/h;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    iput-object p1, p0, Lcom/google/android/play/core/integrity/o;->c:Lp6/h;

    .line 24
    .line 25
    new-instance v0, Lcom/google/android/play/core/integrity/af;

    .line 26
    .line 27
    invoke-direct {v0, p2, p1}, Lcom/google/android/play/core/integrity/af;-><init>(Lp6/h;Lp6/h;)V

    .line 28
    .line 29
    .line 30
    invoke-static {v0}, Lp6/f;->b(Lp6/g;)Lp6/h;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    iput-object p1, p0, Lcom/google/android/play/core/integrity/o;->d:Lp6/h;

    .line 35
    .line 36
    new-instance p2, Lcom/google/android/play/core/integrity/x;

    .line 37
    .line 38
    invoke-direct {p2, p1}, Lcom/google/android/play/core/integrity/x;-><init>(Lp6/h;)V

    .line 39
    .line 40
    .line 41
    invoke-static {p2}, Lp6/f;->b(Lp6/g;)Lp6/h;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    iput-object p1, p0, Lcom/google/android/play/core/integrity/o;->e:Lp6/h;

    .line 46
    .line 47
    return-void

    .line 48
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    .line 49
    .line 50
    const-string p2, "instance cannot be null"

    .line 51
    .line 52
    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    throw p1
.end method


# virtual methods
.method public final a()Lcom/google/android/play/core/integrity/IntegrityManager;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/play/core/integrity/o;->e:Lp6/h;

    .line 2
    .line 3
    invoke-interface {v0}, Lp6/h;->a()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/google/android/play/core/integrity/IntegrityManager;

    .line 8
    .line 9
    return-object v0
.end method
