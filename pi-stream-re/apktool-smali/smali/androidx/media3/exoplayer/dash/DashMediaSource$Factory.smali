.class public final Landroidx/media3/exoplayer/dash/DashMediaSource$Factory;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv1/v;


# instance fields
.field public final a:Lm1/m;

.field public final b:Lh1/g;

.field public final c:Landroidx/fragment/app/g;

.field public final d:Lj6/e;

.field public final e:Landroidx/lifecycle/q0;

.field public final f:J

.field public final g:J


# direct methods
.method public constructor <init>(Lh1/g;)V
    .locals 2

    .line 1
    new-instance v0, Lm1/m;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Lm1/m;-><init>(Lh1/g;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Landroidx/media3/exoplayer/dash/DashMediaSource$Factory;->a:Lm1/m;

    .line 10
    .line 11
    iput-object p1, p0, Landroidx/media3/exoplayer/dash/DashMediaSource$Factory;->b:Lh1/g;

    .line 12
    .line 13
    new-instance p1, Landroidx/fragment/app/g;

    .line 14
    .line 15
    invoke-direct {p1}, Landroidx/fragment/app/g;-><init>()V

    .line 16
    .line 17
    .line 18
    iput-object p1, p0, Landroidx/media3/exoplayer/dash/DashMediaSource$Factory;->c:Landroidx/fragment/app/g;

    .line 19
    .line 20
    new-instance p1, Landroidx/lifecycle/q0;

    .line 21
    .line 22
    const/4 v0, 0x0

    .line 23
    invoke-direct {p1, v0}, Landroidx/lifecycle/q0;-><init>(I)V

    .line 24
    .line 25
    .line 26
    iput-object p1, p0, Landroidx/media3/exoplayer/dash/DashMediaSource$Factory;->e:Landroidx/lifecycle/q0;

    .line 27
    .line 28
    const-wide/16 v0, 0x7530

    .line 29
    .line 30
    iput-wide v0, p0, Landroidx/media3/exoplayer/dash/DashMediaSource$Factory;->f:J

    .line 31
    .line 32
    const-wide/32 v0, 0x4c4b40

    .line 33
    .line 34
    .line 35
    iput-wide v0, p0, Landroidx/media3/exoplayer/dash/DashMediaSource$Factory;->g:J

    .line 36
    .line 37
    new-instance p1, Lj6/e;

    .line 38
    .line 39
    const/16 v0, 0x1d

    .line 40
    .line 41
    invoke-direct {p1, v0}, Lj6/e;-><init>(I)V

    .line 42
    .line 43
    .line 44
    iput-object p1, p0, Landroidx/media3/exoplayer/dash/DashMediaSource$Factory;->d:Lj6/e;

    .line 45
    .line 46
    return-void
.end method


# virtual methods
.method public final a(Lc1/k0;)Lm1/j;
    .locals 13

    .line 1
    iget-object v0, p1, Lc1/k0;->b:Lc1/f0;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    new-instance v2, Ln1/e;

    .line 7
    .line 8
    invoke-direct {v2}, Ln1/e;-><init>()V

    .line 9
    .line 10
    .line 11
    iget-object v0, v0, Lc1/f0;->d:Ljava/util/List;

    .line 12
    .line 13
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    if-nez v3, :cond_0

    .line 18
    .line 19
    new-instance v3, Landroidx/appcompat/widget/a0;

    .line 20
    .line 21
    const/16 v4, 0xd

    .line 22
    .line 23
    invoke-direct {v3, v4, v2, v0}, Landroidx/appcompat/widget/a0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    move-object v3, v2

    .line 28
    :goto_0
    new-instance v12, Lm1/j;

    .line 29
    .line 30
    iget-object v2, p0, Landroidx/media3/exoplayer/dash/DashMediaSource$Factory;->b:Lh1/g;

    .line 31
    .line 32
    iget-object v4, p0, Landroidx/media3/exoplayer/dash/DashMediaSource$Factory;->a:Lm1/m;

    .line 33
    .line 34
    iget-object v5, p0, Landroidx/media3/exoplayer/dash/DashMediaSource$Factory;->d:Lj6/e;

    .line 35
    .line 36
    iget-object v0, p0, Landroidx/media3/exoplayer/dash/DashMediaSource$Factory;->c:Landroidx/fragment/app/g;

    .line 37
    .line 38
    invoke-virtual {v0, p1}, Landroidx/fragment/app/g;->b(Lc1/k0;)Lo1/q;

    .line 39
    .line 40
    .line 41
    move-result-object v6

    .line 42
    iget-object v7, p0, Landroidx/media3/exoplayer/dash/DashMediaSource$Factory;->e:Landroidx/lifecycle/q0;

    .line 43
    .line 44
    iget-wide v8, p0, Landroidx/media3/exoplayer/dash/DashMediaSource$Factory;->f:J

    .line 45
    .line 46
    iget-wide v10, p0, Landroidx/media3/exoplayer/dash/DashMediaSource$Factory;->g:J

    .line 47
    .line 48
    move-object v0, v12

    .line 49
    move-object v1, p1

    .line 50
    invoke-direct/range {v0 .. v11}, Lm1/j;-><init>(Lc1/k0;Lh1/g;Lz1/q;Lm1/m;Lj6/e;Lo1/q;Landroidx/lifecycle/q0;JJ)V

    .line 51
    .line 52
    .line 53
    return-object v12
.end method
