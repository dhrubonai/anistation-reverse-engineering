.class public final Landroidx/fragment/app/u;
.super Landroidx/fragment/app/x;
.source "SourceFile"


# instance fields
.field public final synthetic a:Landroidx/fragment/app/o;

.field public final synthetic b:Ljava/util/concurrent/atomic/AtomicReference;

.field public final synthetic c:Ld/a;

.field public final synthetic d:Lc/b;

.field public final synthetic e:Landroidx/fragment/app/y;


# direct methods
.method public constructor <init>(Landroidx/fragment/app/y;Landroidx/fragment/app/o;Ljava/util/concurrent/atomic/AtomicReference;Ld/c;Lf8/b;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/fragment/app/u;->e:Landroidx/fragment/app/y;

    .line 2
    .line 3
    iput-object p2, p0, Landroidx/fragment/app/u;->a:Landroidx/fragment/app/o;

    .line 4
    .line 5
    iput-object p3, p0, Landroidx/fragment/app/u;->b:Ljava/util/concurrent/atomic/AtomicReference;

    .line 6
    .line 7
    iput-object p4, p0, Landroidx/fragment/app/u;->c:Ld/a;

    .line 8
    .line 9
    iput-object p5, p0, Landroidx/fragment/app/u;->d:Lc/b;

    .line 10
    .line 11
    invoke-direct {p0}, Landroidx/fragment/app/x;-><init>()V

    .line 12
    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 5

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "fragment_"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Landroidx/fragment/app/u;->e:Landroidx/fragment/app/y;

    .line 9
    .line 10
    iget-object v2, v1, Landroidx/fragment/app/y;->e:Ljava/lang/String;

    .line 11
    .line 12
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    const-string v2, "_rq#"

    .line 16
    .line 17
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    iget-object v2, v1, Landroidx/fragment/app/y;->i0:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 21
    .line 22
    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    iget-object v2, p0, Landroidx/fragment/app/u;->a:Landroidx/fragment/app/o;

    .line 34
    .line 35
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    iget-object v2, v2, Landroidx/fragment/app/o;->a:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast v2, Landroidx/fragment/app/y;

    .line 41
    .line 42
    iget-object v3, v2, Landroidx/fragment/app/y;->J:Landroidx/fragment/app/a0;

    .line 43
    .line 44
    instance-of v4, v3, Lc/i;

    .line 45
    .line 46
    if-eqz v4, :cond_0

    .line 47
    .line 48
    iget-object v2, v3, Landroidx/fragment/app/a0;->G:Landroidx/fragment/app/b0;

    .line 49
    .line 50
    invoke-virtual {v2}, Landroidx/activity/j;->getActivityResultRegistry()Lc/h;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    goto :goto_0

    .line 55
    :cond_0
    invoke-virtual {v2}, Landroidx/fragment/app/y;->N()Landroidx/fragment/app/b0;

    .line 56
    .line 57
    .line 58
    move-result-object v2

    .line 59
    invoke-virtual {v2}, Landroidx/activity/j;->getActivityResultRegistry()Lc/h;

    .line 60
    .line 61
    .line 62
    move-result-object v2

    .line 63
    :goto_0
    iget-object v3, p0, Landroidx/fragment/app/u;->c:Ld/a;

    .line 64
    .line 65
    iget-object v4, p0, Landroidx/fragment/app/u;->d:Lc/b;

    .line 66
    .line 67
    invoke-virtual {v2, v0, v1, v3, v4}, Lc/h;->c(Ljava/lang/String;Landroidx/lifecycle/u;Ld/a;Lc/b;)Lc/e;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    iget-object v1, p0, Landroidx/fragment/app/u;->b:Ljava/util/concurrent/atomic/AtomicReference;

    .line 72
    .line 73
    invoke-virtual {v1, v0}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    return-void
.end method
