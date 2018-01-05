Embulk::JavaPlugin.register_input(
  "github_repositories", "org.embulk.input.github_repositories.GithubRepositoriesInputPlugin",
  File.expand_path('../../../../classpath', __FILE__))
