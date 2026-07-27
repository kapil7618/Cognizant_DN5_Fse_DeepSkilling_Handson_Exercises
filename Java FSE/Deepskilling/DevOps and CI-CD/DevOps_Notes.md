# DevOps Notes

## What DevOps aims to achieve
- Improve collaboration between development and operations teams.
- Automate build, test, packaging, and deployment workflows.
- Reduce manual effort and increase delivery speed.

## Core practices
- Version control with Git
- Continuous Integration (CI) with automated tests
- Continuous Delivery/Deployment (CD)
- Infrastructure as Code and environment consistency
- Monitoring and feedback loops

## GitHub Actions basics
- Workflows are defined in `.github/workflows`.
- Each workflow can run on pushes, pull requests, or scheduled events.
- Jobs can build, test, lint, package, or deploy applications.

## Useful checklist
1. Keep builds fast and deterministic.
2. Run tests on every pull request.
3. Store build artifacts for inspection.
4. Use secrets for sensitive configuration.
5. Review logs and deploy metrics after each release.
